package it.xseris.jca.test.hashing.hash;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.hashing.hash.SHA384;

import org.junit.Test;

public class SHA384Test {

	@Test
	public void testEncode() {
		assertEquals("768412320f7b0aa5812fce428dc4706b3cae50e02a64caa16a782249bfe8efc4b7ef1ccb126255d196047dfedf17a0a9"
				.toUpperCase(), SHA384.encode("test"));
	}
}
