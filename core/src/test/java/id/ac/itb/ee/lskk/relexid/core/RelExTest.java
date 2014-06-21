package id.ac.itb.ee.lskk.relexid.core;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl;
import id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl;

import java.util.List;
import java.util.Locale;

import javax.xml.namespace.QName;

import org.hamcrest.Matchers;
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
			// Verb
			.put(DBPEDIA_NS + "Love", "love")
			.put(DBPEDIA_NS + "Like", "like")
			// Animal
			.put(DBPEDIA_NS + "Elephant", "elephant")
			.build();
		DICT_ID_ID = ImmutableMap.<String, String>builder()
				// Verb
				.put(DBPEDIA_NS + "Love", "cinta")
				.put(DBPEDIA_NS + "Like", "suka")
				// Animal
				.put(DBPEDIA_NS + "Elephant", "gajah")
				.build();
		relex = new RelEx();
		relex.setDictionary(DICT_ID_ID);
		
//		relex.loadTranslations();
		relex.loadLexRules(RelExTest.class, "lumen.LexRules.xmi");
		relex.loadRelationRules(RelExTest.class, "lumen.RelationRules.xmi");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void akuCintaKamu() {
		final Sentence sentence = relex.parse("Aku cinta kamu.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		log.info("Sentence in Indonesian: {}", sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex));
		assertEquals("(S (PP i) (VP dbpedia:Love (PP you_o)) . )", sentence.toString());
	}
	
	@Test
	public void akuCintaKamuGenerate() {
		final Sentence sentence = relex.parse("Aku cinta kamu.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP love-v (PP you_o)) . )", sentence.toString());
		assertEquals("Aku sayang kamu.", indonesian);
	}
	
	@Test
	public void akuMengagumiKamuGenerate() {
		final Sentence sentence = relex.parse("Aku mengagumi kamu.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP admire-v (PP you_o)) . )", sentence.toString());
		assertEquals("Aku menggemari kamu.", indonesian);
	}
	
	@Test
	public void iLoveYouRelations() {
		final Sentence sentence = RelexidFactory.eINSTANCE.createSentence();
		final PronounPart i = PronounPartImpl.I;
		sentence.getParts().add( i );
		final VerbPart love = RelexidFactory.eINSTANCE.createVerbPart();
		love.setResource(new QName(DBPEDIA_NS, "Love", "dbpedia"));
		sentence.getParts().add( love );
		final PronounPart you_o = PronounPartImpl.YOU_O;
		love.getParts().add( you_o );
		sentence.getParts().add( PunctuationPartImpl.FULL_STOP );
		log.info("iLoveYou: {}", sentence);
		
		List<Relation> relations = relex.findRelations(sentence.getParts());
		log.info("Relations: {}", relations);
		for (Relation rel : relations) {
			log.info("{}", rel);
		}
		
		assertThat(relations, hasSize(2));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(SubjectRelation.class) ));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(ObjectRelation.class) ));
	}
	
	@Test
	public void akuSukaGajah() {
		final Sentence sentence = relex.parse("Aku suka gajah.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		log.info("Sentence in Indonesian: {}", sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex));
		assertEquals("(S (PP i) (VP dbpedia:Like (NP dbpedia:Elephant)) . )", sentence.toString());
	}
	
	@Test
	public void akuSukaGajahGenerate() {
		final Sentence sentence = relex.parse("Aku suka gajah.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP dbpedia:Like (NP dbpedia:Elephant)) . )", sentence.toString());
		assertEquals("Aku suka gajah.", indonesian);
	}
	
	@Test
	public void akuSayangUntaGenerate() {
		final Sentence sentence = relex.parse("Aku sayang unta.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP love-v (NP camel-n)) . )", sentence.toString());
		assertEquals("Aku sayang unta.", indonesian);
	}
	
	@Test
	public void untaJinggaGenerate() {
		final Sentence sentence = relex.parse("Unta jingga.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (NP (SP orange-s) camel-n) . )", sentence.toString());
		assertEquals("Unta jingga.", indonesian);
	}
	
	@Test
	public void akuMenyayangiUntaJinggaGenerate() {
		final Sentence sentence = relex.parse("Aku menyayangi unta jingga.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP love-v (NP camel-n)) . )", sentence.toString());
		assertEquals("Aku sayang unta.", indonesian);
	}
	
	@Test
	public void akuMenaikiJerapahGenerate() {
		final Sentence sentence = relex.parse("Aku menaiki jerapah.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP drive-v (NP camelopard-n)) . )", sentence.toString());
		assertEquals("Aku pandu jerapah.", indonesian);
	}
	
	@Test
	public void akuMengendaraiMobilGenerate() {
		final Sentence sentence = relex.parse("Aku mengendarai mobil.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		final String indonesian = sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex);
		log.info("Sentence in Indonesian: {}", indonesian);
		assertEquals("(S (PP i) (VP ride-v (NP car-n)) . )", sentence.toString());
		assertEquals("Aku berjalan motokar.", indonesian);
	}
	
	@Test
	public void akuCintaKamuRelations() {
		final Sentence sentence = relex.parse("Aku cinta kamu.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		log.info("Sentence in Indonesian: {}", sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex));
		assertEquals("(S (PP i) (VP dbpedia:Love (PP you_o)) . )", sentence.toString());

		List<Relation> relations = sentence.getRelations();
		log.info("Relations: {}", relations);
		for (Relation rel : relations) {
			System.out.println(rel);
		}
		
		assertThat(relations, hasSize(2));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(SubjectRelation.class) ));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(ObjectRelation.class) ));
	}
	
	@Test
	public void akuSukaGajahRelations() {
		relex.loadLexRules(RelExTest.class, "lumen.LexRules.xmi");
		final Sentence sentence = relex.parse("Aku suka gajah.");
		log.info("Sentence structure: {}", sentence);
		log.info("Sentence in English: {}", sentence.generate(Locale.ENGLISH, DICT_EN_US, relex));
		log.info("Sentence in Indonesian: {}", sentence.generate(RelEx.INDONESIAN, DICT_ID_ID, relex));
		assertEquals("(S (PP i) (VP dbpedia:Like (NP dbpedia:Elephant)) . )", sentence.toString());
		
		List<Relation> relations = sentence.getRelations();
		log.info("Relations: {}", relations);
		for (Relation rel : relations) {
			System.out.println(rel);
		}
		
		assertThat(relations, hasSize(2));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(SubjectRelation.class) ));
		assertThat(relations, Matchers.<Relation>hasItem( instanceOf(ObjectRelation.class) ));
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
