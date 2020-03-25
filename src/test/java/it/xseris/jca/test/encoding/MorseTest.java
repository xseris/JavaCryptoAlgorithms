package it.xseris.jca.test.encoding;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.encoding.Morse;

import org.junit.Test;

public class MorseTest {

	@Test
	public void testEncode() {
		assertEquals("__ ___ ._. ... .", Morse.encode("morse"));
	}

	@Test
	public void testDecode() {
		assertEquals("morse", Morse.decode("__ ___ ._. ... ."));
	}

	@Test
	public void testEncodeCustom() {
		assertEquals("-- --- *-* *** *", Morse.encode("morse", "*", "-"));
	}

	@Test
	public void testDecodeCustom() {
		assertEquals("morse", Morse.decode("-- --- *-* *** *", "*", "-"));
	}
}
