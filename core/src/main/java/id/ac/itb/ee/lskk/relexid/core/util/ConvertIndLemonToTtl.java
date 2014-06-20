package id.ac.itb.ee.lskk.relexid.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * Naively converts WordNet Bahasa (msa) from XML to TTL.
 * By naive:
 * <ol>
 * <li>it retains indirect {@code lemon:reference wn30:01635056-v}
 * while it should be something like {@code wn30:synset-inform-verb-1}.</li>
 * <li>It doesn't adhere to RFC 3066 section 2.3 which mandates {@code id} over {@code ind} language tag.</li>
 * </ol>
 * @author ceefour
 */
public class ConvertIndLemonToTtl {
	
	private static final Logger log = LoggerFactory
			.getLogger(ConvertIndLemonToTtl.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Model model = ModelFactory.createDefaultModel();
		model.setNsPrefix("wn30", "http://wordnet-rdf.princeton.edu/wn30/");
		model.setNsPrefix("wn30-msa", "http://wn-msa.sourceforge.net/wn30-msa/");
		
		final File rdfXmlFile = new File("/media/ceefour/passport/project_passport/Lumen/msa/wn-ind-lemon.xml");
		log.info("Loading {}...", rdfXmlFile);
		model.read(new FileInputStream(rdfXmlFile), "http://wn-msa.sourceforge.net/wn30-msa/", "RDF/XML");
		log.info("Loaded {} triples", model.size());
		
		File ttlFile = new File("/media/ceefour/passport/project_passport/Lumen/msa/wn-ind-lemon.ttl");
		log.info("Writing {}...", ttlFile);
		model.write(new FileOutputStream(ttlFile), "TURTLE");
		log.info("Written {} bytes", ttlFile.length());
	}

}
