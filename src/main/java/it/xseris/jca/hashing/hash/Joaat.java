package it.xseris.jca.hashing.hash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Joaat {

	/**
	 * Hash the input using Jooat algorithm.
	 * 
	 * @param text
	 *            The input text
	 */
	public static String encode(String text) {
		byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
		int hash = 0;

		for (byte b : bytes) {
			hash += b & 0xFF;
			hash += (hash << 10);
			hash ^= (hash >>> 6);
		}

		hash += (hash << 3);
		hash ^= (hash >>> 11);
		hash += (hash << 15);
		return Integer.toHexString(hash);
	}

	/**
	 * Bruteforce the Hash.
	 * 
	 * @param wordlist
	 *            The file containing the words (one per line)
	 * @param target
	 *            The Hash to bruteforce
	 * @return
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
