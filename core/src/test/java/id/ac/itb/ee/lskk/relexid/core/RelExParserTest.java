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

public class RelExParserTest {

	private static final Logger log = LoggerFactory.getLogger(RelExParserTest.class);
	
	private ImmutableMap<String, String> DICT_EN_US;
	private ImmutableMap<String, String> DICT_ID_ID;
	
	private RelEx relex;
	
	@Before
	public void setUp() throws Exception {
		DICT_EN_US = ImmutableMap.<String, String>builder()
			// Verb
			.put(RelEx.DBPEDIA_NS + "Love", "love")
			.put(RelEx.DBPEDIA_NS + "Like", "like")
			.put(RelEx.WN31_NS + "200675902-v", "like")
			// Animal
			.put(RelEx.DBPEDIA_NS + "Elephant", "elephant")
			.put(RelEx.WN31_NS + "102506148-n", "elephant")
			.build();
		DICT_ID_ID = ImmutableMap.<String, String>builder()
				// Verb
				.put(RelEx.DBPEDIA_NS + "Love", "cinta")
				.put(RelEx.DBPEDIA_NS + "Like", "suka")
				.put(RelEx.WN31_NS + "200675902-v", "suka")
				// Animal
				.put(RelEx.DBPEDIA_NS + "Elephant", "gajah")
				.put(RelEx.WN31_NS + "102506148-n", "gajah")
				.build();
		relex = new RelEx();
		relex.setDictionary(DICT_ID_ID);
		
		relex.loadTranslations();
		
		relex.loadLexRules(RelExParserTest.class, "lumen.LexRules.xmi");
		relex.loadRelationRules(RelExParserTest.class, "lumen.RelationRules.xmi");
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
	public void iLoveYouRelations() {
		final Sentence sentence = RelexidFactory.eINSTANCE.createSentence();
		final PronounPart i = PronounPartImpl.I;
		sentence.getParts().add( i );
		final VerbPart love = RelexidFactory.eINSTANCE.createVerbPart();
		love.setResource(new QName(RelEx.DBPEDIA_NS, "Love", "dbpedia"));
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
		relex.loadLexRules(RelExParserTest.class, "lumen.LexRules.xmi");
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
