package id.ac.itb.ee.lskk.relexid.core;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;

public class RelExTest {

	private static final Logger log = LoggerFactory.getLogger(RelExTest.class);
	private static final String DBPEDIA_NS = "http://dbpedia.org/resource/";
	private ImmutableMap<String, String> DICT_EN_US;
	private ImmutableMap<String, String> DICT_ID_ID;
	
	private RelEx relex;
	
	@Before
	public void setUp() throws Exception {
		DICT_EN_US = ImmutableMap.<String, String>builder()
			.put(DBPEDIA_NS + "Love", "love")
			.build();
		DICT_ID_ID = ImmutableMap.<String, String>builder()
				.put(DBPEDIA_NS + "Love", "cinta")
				.build();
		relex = new RelEx();
		relex.setDictionary(DICT_ID_ID);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void akuCintaKamu() {
		relex.loadRules(RelExTest.class, "lumen.LexRules.xmi");
		final Sentence sentence = relex.parse("Aku cinta kamu.");
		log.info("Sentence: {}", sentence);
		assertEquals("(S (PP i) (VP dbpedia:Love (PP you_o)) . )", sentence.toString());
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
