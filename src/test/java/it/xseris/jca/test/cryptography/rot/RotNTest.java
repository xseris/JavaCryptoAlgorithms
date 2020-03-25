package it.xseris.jca.test.cryptography.rot;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.cryptography.rot.RotN;

import org.junit.Test;

public class RotNTest {

	@Test
	public void testEncode() {
		assertEquals("nopqrstuvwxyz", RotN.rotate("abcdefghijklm", 13));
	}

	@Test
	public void testDecode() {
		assertEquals("abcdefghijklm", RotN.rotate("nopqrstuvwxyz", -13));
	}

}
