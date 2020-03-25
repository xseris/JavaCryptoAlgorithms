package it.xseris.jca.hashing.hash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Dahua {

	/**
	 * Hash the input using Dahua algorithm.
	 * 
	 * @param text
	 *            The input text
	 * @return The result.
	 */
	public static String encode(String text) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes());
			byte[] digest = md.digest();

			int j = 0;
			int[] out = new int[8];
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < digest.length; i += 2) {
				int a = (int) digest[i];
				if (a < 0) {
					a += 256;
				}
				int b = (int) digest[i + 1];
				if (b < 0) {
					b += 256;
				}
				int o = (a + b) % 62;
				out[j] = o;
				if (out[j] < 10) {
					out[j] += 48;
				} else if (out[j] < 36) {
					out[j] += 55;
				} else {
					out[j] += 61;
				}
				j = j + 1;
			}
			for (int i : out) {
				sb.append((char) i);
			}
			return sb.toString();
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
