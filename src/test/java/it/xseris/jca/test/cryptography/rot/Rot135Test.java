package it.xseris.jca.test.cryptography.rot;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.cryptography.rot.Rot135;

import org.junit.Test;

public class Rot135Test {

	@Test
	public void testEncode() {
		assertEquals("nopqrstuvwxyz67890", Rot135.encode("abcdefghijklm12345"));
	}

	@Test
	public void testDecode() {
		assertEquals("abcdefghijklm12345", Rot135.decode("nopqrstuvwxyz67890"));
	}

}
