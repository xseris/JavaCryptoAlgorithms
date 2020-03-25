package it.xseris.jca.hashing.hash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class SHA1 {

	/**
	 * Hash the input using SHA-1 algorithm.
	 * 
	 * @param text
	 *            The input text
	 * @return The result.
	 */
	public static String encode(String text) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
			md.update(text.getBytes());
			byte[] digest = md.digest();
			return DatatypeConverter.printHexBinary(digest).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			return e.getMessage();
		}
	}

	/**
	 * Bruteforce the Hash.
	 * 
	 * @param wordlist
	 *            The file containing the words (one per line)
	 * @param target
	 *            The Hash to bruteforce
	 * @return The result.
	 */
	public static String bruteforce(File wordlist, String target) {
		try (BufferedReader reader = new BufferedReader(new FileReader(wordlist));) {
			String line = reader.readLine();
			while (line != null) {
				String hash = encode(line);
				if (hash.equalsIgnoreCase(target)) {
					return line;
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "not found";
	}

}
