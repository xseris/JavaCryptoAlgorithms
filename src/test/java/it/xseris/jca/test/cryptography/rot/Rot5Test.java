package it.xseris.jca.test.cryptography.rot;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.cryptography.rot.Rot5;

import org.junit.Test;

public class Rot5Test {

	@Test
	public void testEncode() {
		assertEquals("12345", Rot5.encode("67890"));
	}

	@Test
	public void testDecode() {
		assertEquals("67890", Rot5.decode("12345"));
	}

}
