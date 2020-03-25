package it.xseris.jca.cryptography.rot;

public class RotN {

	/**
	 * Rotate the text by n positions.
	 * 
	 * @param text
	 *            The input text.
	 * @param shift
	 *            The rotation magnitude.
	 */
	public static String rotate(String text, int shift) {
		StringBuilder sb = new StringBuilder();
		int len = text.length();
		for (int x = 0; x < len; x++) {
			char currentChar = text.charAt(x);
			char newChar = (char) (currentChar + shift);
			if (currentChar >= 'a' && currentChar <= 'z') {
				if (newChar > 'z') {
					sb.append((char) (currentChar - (26 - shift)));
				} else {
					sb.append((char) (currentChar + shift));
				}
			} else if (currentChar >= 'A' && currentChar <= 'Z') {
				if (newChar > 'Z') {
					sb.append((char) (currentChar - (26 - shift)));
				} else {
					sb.append((char) (currentChar + shift));
				}
			} else {
				sb.append(currentChar);
			}
		}
		return sb.toString();
	}
}
