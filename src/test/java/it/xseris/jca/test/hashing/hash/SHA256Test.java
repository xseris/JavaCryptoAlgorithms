package it.xseris.jca.test.hashing.hash;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.hashing.hash.SHA256;

import org.junit.Test;

public class SHA256Test {

	@Test
	public void testEncode() {
		assertEquals("9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08".toUpperCase(),
				SHA256.encode("test"));
	}
}
