package id.ac.itb.ee.lskk.relexid.core;

import javax.annotation.Nullable;
import javax.xml.namespace.QName;

/**
 * Saves information about matched lexical pattern during {@link RelEx#parse(String)}.
 * @author ceefour
 */
class CapturingGroup {
	
	@Nullable
	private final QName resource;

	public CapturingGroup(@Nullable QName resource) {
		super();
		this.resource = resource;
	}
	
	@Nullable
	public QName getResource() {
		return resource;
	}
	
	@Override
	public String toString() {
		return resource != null ? resource.toString() : "null";
	}
	
}
