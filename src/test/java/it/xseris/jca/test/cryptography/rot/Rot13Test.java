package it.xseris.jca.test.cryptography.rot;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.cryptography.rot.Rot13;

import org.junit.Test;

public class Rot13Test {

	@Test
	public void testEncode() {
		assertEquals("nopqrstuvwxyz", Rot13.encode("abcdefghijklm"));
	}

	@Test
	public void testDecode() {
		assertEquals("abcdefghijklm", Rot13.decode("nopqrstuvwxyz"));
	}

}
