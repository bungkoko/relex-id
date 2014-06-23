package id.ac.itb.ee.lskk.relexid.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.ImmutableMap;

/**
 * @author ceefour
 *
 */
@Configuration
public class RelExConfig {

	@Bean
	public RelEx relex() {
		RelEx relex = new RelEx();
		relex.setDictionary(ImmutableMap.<String, String>of());
		
//		relex.loadTranslations();
		relex.loadLexRules(RelEx.class, "lumen.LexRules.xmi");
		relex.loadRelationRules(RelEx.class, "lumen.RelationRules.xmi");
		return relex;
	}

}
