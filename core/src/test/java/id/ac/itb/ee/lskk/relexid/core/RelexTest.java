package id.ac.itb.ee.lskk.relexid.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RelexTest {

	private Relex relex;

	@Before
	public void setUp() throws Exception {
		relex = new Relex();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void akuMelihatBinatangGajahDiKebunBinatang() {
		relex.parse("Aku melihat binatang gajah di kebun binatang.");
	}
	
	/**
	 * Kamu melihat binatang apa di kebun binatang?
	 */
	public void kamuMelihatBinatangApaDiKebunBinatang() {
		relex.parse("Kamu melihat binatang apa di kebun binatang?");
	}
	
	/**
	 * Binatang apa yang kamu lihat di kebun binatang?
	 */
	public void binatangApaYangKamuLihatDiKebunBinatang() {
		relex.parse("Binatang apa yang kamu lihat di kebun binatang?");
	}

	/**
	 * Apa binatang yang kamu lihat di kebun binatang?
	 */
	public void apaBinatangYangKamuLihatDiKebunBinatang() {
		relex.parse("Apa binatang yang kamu lihat di kebun binatang?");
	}

}
