package id.ac.itb.ee.lskk.relexid.core.impl;

import static org.junit.Assert.assertEquals;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.Sentence;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import javax.xml.namespace.QName;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SentenceImplTest {

	private static final Logger log = LoggerFactory
			.getLogger(SentenceImplTest.class);
	
	@Before
	public void setUp() throws Exception {
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
		love.setResource(new QName("http://dbpedia.org/resource/", "Love", "dbpedia"));
		sentence.getParts().add( love );
		final PronounPart you_o = PronounPartImpl.YOU_O;
		love.getParts().add( you_o );
		log.info("iLoveYou: {}", sentence);
		assertEquals("(S (PP i) (VP dbpedia:Love (PP you_o)) )", sentence.toString());
	}

}
