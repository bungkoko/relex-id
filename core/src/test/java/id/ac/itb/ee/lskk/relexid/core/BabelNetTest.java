package id.ac.itb.ee.lskk.relexid.core;

import it.uniroma1.lcl.babelnet.BabelNetConfiguration;
import it.uniroma1.lcl.jlt.ling.Word;
import it.uniroma1.lcl.jlt.util.Language;
import it.uniroma1.lcl.jlt.util.ScoredItem;
import it.uniroma1.lcl.knowledge.KnowledgeBase;
import it.uniroma1.lcl.knowledge.graph.KnowledgeGraph;
import it.uniroma1.lcl.knowledge.graph.KnowledgeGraphFactory;
import it.uniroma1.lcl.knowledge.graph.KnowledgeGraphScorer;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * See {@code README.adoc} for BabelNet configuration.
 * @author ceefour
 */
public class BabelNetTest {

	private static KnowledgeBase babelnetKb;
	private static KnowledgeGraphScorer degreeScorer;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpClass() throws Exception {
		BabelNetConfiguration.getInstance().setConfigurationFile(
				new File(System.getProperty("user.home") + "/BabelNet-API-2.5/config", BabelNetConfiguration.CONFIG_FILE));
		babelnetKb = KnowledgeBase.BABELNET;
		degreeScorer = KnowledgeGraphScorer.DEGREE;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void bankBonusPayStock() throws IOException {
		List<Word> sentence = Arrays.asList(
				new Word[]{new Word("bank", "n", Language.EN), new Word("bonus", "n", Language.EN),
						new Word("pay", "v", Language.EN), new Word("stock", "n", Language.EN)});
		disambiguate(sentence, babelnetKb, degreeScorer);
	}

	public void disambiguate(Collection<Word> words, KnowledgeBase kb, KnowledgeGraphScorer scorer) throws IOException {
		KnowledgeGraphFactory factory = KnowledgeGraphFactory.getInstance(kb);
		KnowledgeGraph kGraph = factory.getKnowledgeGraph(words);
		Map<String, Double> scores = scorer.score(kGraph);
		for (String concept : scores.keySet()) {
			double score = scores.get(concept);
			for (Word word : kGraph.wordsForConcept(concept))
				word.addLabel(concept, score);
			}
			for (Word word : words) {
				System.out.println("\n\t" + word.getWord() + " -- ID " + word.getId() +
						" => SENSE DISTRIBUTION: ");
				for (ScoredItem<String> label : word.getLabels()) {
					System.out.println("\t  [" + label.getItem() + "]:" +
							NumberFormat.getNumberInstance(Locale.ENGLISH).format(label.getScore()));
				} 
			}
	}
}
