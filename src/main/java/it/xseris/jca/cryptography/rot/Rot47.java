package it.xseris.jca.cryptography.rot;

public class Rot47 {

	/**
	 * Encode the text using ROT-47.
	 * 
	 * @param text
	 *            The input text.
	 */
	public static String encode(String text) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c != ' ') {
				c += 47;
				if (c > '~') {
					c -= 94;
				}
			}
			ret.append(c);
		}
		return ret.toString();
	}

	/**
	 * Decode the text using ROT-47.
	 * 
	 * @param text
	 *            The input text.
	 */
	public static String decode(String text) {
		return encode(text);
	}

}
