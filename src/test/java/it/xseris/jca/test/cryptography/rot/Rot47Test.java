package it.xseris.jca.test.cryptography.rot;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.cryptography.rot.Rot47;

import org.junit.Test;

public class Rot47Test {

	@Test
	public void testEncode() {
		assertEquals("PQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~",
				Rot47.encode("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNO"));
	}

	@Test
	public void testDecode() {
		assertEquals("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNO",
				Rot47.decode("PQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"));
	}

}
