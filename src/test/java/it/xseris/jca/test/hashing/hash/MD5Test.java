package it.xseris.jca.test.hashing.hash;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.hashing.hash.MD5;

import org.junit.Test;

public class MD5Test {

	@Test
	public void testEncode() {
		assertEquals("098f6bcd4621d373cade4e832627b4f6".toUpperCase(), MD5.encode("test"));
	}
}
