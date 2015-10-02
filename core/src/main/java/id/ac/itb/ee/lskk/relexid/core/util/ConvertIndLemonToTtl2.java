package id.ac.itb.ee.lskk.relexid.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * Enhanced converts WordNet Bahasa (msa) from XML to TTL.
 * By enhanced:
 * <ol>
 * <li>it replaces indirect {@code lemon:reference wn30:01635056-v}
 * with something like {@code wn30:synset-inform-verb-1}.</li>
 * <li>It adheres to RFC 3066 section 2.3 by fixing to {@code id} from {@code ind} language tag.</li>
 * <li>Replaces the {@code wn30} references with {@code wn31 http://wordnet-rdf.princeton.edu/wn31/} ,
 * 		with synset IDs like {@code 100001740-n}</li>
 * </ol>
 * @author ceefour
 * @deprecated Not working as advertised above.
 * 		For now you can use WordNet 3.1 + TDB, which already provides translation for {@code ind},
 * 		and also {@code wordnet-ontology:lexical_domain}. Maybe later on we need to refer to Indonesian-specific
 * 		words and synsets/senses but perhaps not now.  
 */
@Deprecated
public class ConvertIndLemonToTtl2 {
	
	private static final String WN20SCHEMA = "http://www.w3.org/2006/03/wn/wn20/schema/";
	private static final Logger log = LoggerFactory
			.getLogger(ConvertIndLemonToTtl2.class);

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		Model synsetModel = ModelFactory.createDefaultModel();
//		final String synsetFile = "/media/ceefour/passport/project_passport/Lumen/msa/rdf-wordnet-synset.ttl";
//		log.info("Loading {}...", synsetFile);
//		synsetModel.read(synsetFile, null, "TURTLE");
//		
//		Property rdfType = synsetModel.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#type");
//		Property synsetId = synsetModel.createProperty(WN20SCHEMA, "synsetId");
//		Resource nounSynset = synsetModel.createResource(WN20SCHEMA + "NounSynset");
//		Resource verbSynset = synsetModel.createResource(WN20SCHEMA + "VerbSynset");
//		Resource adjectiveSynset = synsetModel.createResource(WN20SCHEMA + "AdjectiveSynset");
//		Resource adverbSynset = synsetModel.createResource(WN20SCHEMA + "AdverbSynset");
//		Resource adjectiveSatelliteSynset = synsetModel.createResource(WN20SCHEMA + "AdjectiveSatelliteSynset");
//		Resource phraseSynset = synsetModel.createResource(WN20SCHEMA + "PhraseSynset");
//		
//		for (ResIterator iter = synsetModel.listSubjects(); iter.hasNext(); ) {
//			Resource res = iter.next();
//			Resource resType = res.getPropertyResourceValue(rdfType);
//			long resSynsetId = res.getRequiredProperty(synsetId).getLong();
//			if (nounSynset.equals(resType)) {
//				
//			} else if (verbSynset.equals(resType)) {
//				
//			} else if (adjectiveSynset.equals(resType)) {
//				
//			} else if (adverbSynset.equals(resType)) {
//				
//			} else if (adjectiveSynset.equals(resType)) {
//				
//			} else if (adjectiveSatelliteSynset.equals(resType)) {
//				
//			} else if (phraseSynset.equals(resType)) {
//				
//			}
//			
//		}
		
		Model model = ModelFactory.createDefaultModel();
		model.setNsPrefix("wn31", "http://wordnet-rdf.princeton.edu/wn31/");
		model.setNsPrefix("wn30-msa", "http://wn-msa.sourceforge.net/wn30-msa/");
		
		// Convert to wn31
//		model.getResource("").
		
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
