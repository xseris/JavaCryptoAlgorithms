package it.xseris.jca.test.hashing.hash;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.hashing.hash.SHA512;

import org.junit.Test;

public class SHA512Test {

	@Test
	public void testEncode() {
		assertEquals(
				"ee26b0dd4af7e749aa1a8ee3c10ae9923f618980772e473f8819a5d4940e0db27ac185f8a0e1d5f84f88bc887fd67b143732c304cc5fa9ad8e6f57f50028a8ff"
						.toUpperCase(),
				SHA512.encode("test"));
	}
}
