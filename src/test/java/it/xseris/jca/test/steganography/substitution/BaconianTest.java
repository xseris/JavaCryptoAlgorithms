package it.xseris.jca.test.steganography.substitution;

import static org.junit.Assert.assertEquals;

import it.xseris.jca.steganography.substitution.BaconianCipher;

import org.junit.Test;

public class BaconianTest {

	@Test
	public void testEncodeLatin() {
		assertEquals("aaaabaaaaaaaabaabbababbaa", BaconianCipher.encodeLatin("bacon"));
	}

	@Test
	public void testEncodeFull() {
		assertEquals("aaaabaaaaaaaabaabbbaabbab", BaconianCipher.encodeFull("bacon"));
	}

	@Test
	public void testDecodeLatin() {
		assertEquals("bacon", BaconianCipher.decodeLatin("aaaabaaaaaaaabaabbababbaa"));
	}

	@Test
	public void testDecodeFull() {
		assertEquals("bacon", BaconianCipher.decodeFull("aaaabaaaaaaaabaabbbaabbab"));
	}

}
