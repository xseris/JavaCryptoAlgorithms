package it.xseris.jca.test.hashing.hash;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.hashing.hash.SHA1;

import org.junit.Test;

public class SHA1Test {

	@Test
	public void testEncode() {
		assertEquals("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3".toUpperCase(), SHA1.encode("test"));
	}
}
