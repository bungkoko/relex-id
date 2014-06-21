package id.ac.itb.ee.lskk.relexid.core;

import java.util.Locale;

import javax.xml.namespace.QName;

/**
 *
 * @author ceefour
 */
public interface Translator {

	/**
	 * Returns translation for {@code ref} in the Translator's language.
	 * @param locale TODO
	 * @param ref
	 * @return
	 * @throws IllegalArgumentException If {@code locale} is not supported or translation not found. 
	 */
	public String getTranslation(Locale locale, QName ref);
	
}
