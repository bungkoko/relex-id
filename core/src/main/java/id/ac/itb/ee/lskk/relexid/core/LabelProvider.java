package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

public interface LabelProvider {

	/**
	 * Get the sense's {@code rdfs:label} in English if possible, otherwise
	 * return {@link #shortQName(QName)}.
	 * @param ref
	 * @return
	 */
	public abstract String getSenseLabel(QName ref);

}