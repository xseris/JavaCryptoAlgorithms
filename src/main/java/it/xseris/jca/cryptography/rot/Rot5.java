package it.xseris.jca.cryptography.rot;

import java.util.HashMap;
import java.util.Map;

public class Rot5 {
	protected static Map<Character, String> codeMap;
	static {
		codeMap = new HashMap<>();
		codeMap.put('0', "5");
		codeMap.put('1', "6");
		codeMap.put('2', "7");
		codeMap.put('3', "8");
		codeMap.put('4', "9");
		codeMap.put('5', "0");
		codeMap.put('6', "1");
		codeMap.put('7', "2");
		codeMap.put('8', "3");
		codeMap.put('9', "4");

	}

	/**
	 * Encode the text using ROT-5.
	 * 
	 * @param text
	 *            The input text.
	 * @return The result.
	 */
	public static String encode(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char current = text.charAt(i);
			if (codeMap.containsKey(current)) {
				ret.append(codeMap.get(current));
			} else {
				ret.append(String.valueOf(current));
			}
		}
		return ret.toString();
	}

	/**
	 * Decode the text using ROT-5.
	 * 
	 * @param text
	 *            The input text.
	 * @return The result.
	 */
	public static String decode(String text) {
		return encode(text);
	}
}
