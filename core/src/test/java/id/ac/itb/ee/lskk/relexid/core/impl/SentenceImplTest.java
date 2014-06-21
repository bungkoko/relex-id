package id.ac.itb.ee.lskk.relexid.core.impl;

import static org.junit.Assert.assertEquals;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.Sentence;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import java.util.Locale;

import javax.xml.namespace.QName;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;

public class SentenceImplTest {

	private static final String DBPEDIA_NS = "http://dbpedia.org/resource/";
	private static final Logger log = LoggerFactory
			.getLogger(SentenceImplTest.class);
	private ImmutableMap<String, String> DICT_EN_US;
	private ImmutableMap<String, String> DICT_ID_ID;
	
	@Before
	public void setUp() throws Exception {
		DICT_EN_US = ImmutableMap.<String, String>builder()
			.put(DBPEDIA_NS + "Love", "love")
			.build();
		DICT_ID_ID = ImmutableMap.<String, String>builder()
				.put(DBPEDIA_NS + "Love", "cinta")
				.build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void iLoveYou() {
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
		assertEquals("(S (PP i) (VP dbpedia:Love (PP you_o)) . )", sentence.toString());
		assertEquals("I love you.", sentence.generate(Locale.ENGLISH, DICT_EN_US, null));
		assertEquals("Aku cinta kamu.", sentence.generate(SentenceImpl.INDONESIAN, DICT_ID_ID, null));
	}

}
