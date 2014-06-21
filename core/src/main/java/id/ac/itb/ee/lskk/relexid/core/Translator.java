package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

/**
 *
 * @author ceefour
 */
public interface Translator {

	/**
	 * Returns translation for {@code ref} in the Translator's language.
	 * @param ref
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String getTranslation(QName ref);
	
}
