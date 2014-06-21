package id.ac.itb.ee.lskk.relexid.core;

import javax.annotation.Nullable;
import javax.xml.namespace.QName;

/**
 * Saves information about matched lexical pattern during {@link RelEx#parse(String)}.
 * @author ceefour
 */
public class CapturingGroup {
	
	@Nullable
	private final QName resource;
	private final PartOfSpeech part;

	public CapturingGroup() {
		this((QName) null);
	}
	
	public CapturingGroup(@Nullable QName resource) {
		super();
		this.resource = resource;
		this.part = null;
	}
	
	/**
	 * Captures an entire part of speech.
	 * @param part
	 */
	public CapturingGroup(PartOfSpeech part) {
		super();
		this.part = part;
		this.resource = part.getResource();
	}
	
	@Nullable
	public QName getResource() {
		return resource;
	}
	
	public PartOfSpeech getPart() {
		return part;
	}
	
	@Override
	public String toString() {
		if (part != null) {
			return part.toString();
		} else if (resource != null) {
			return resource.toString();
		} else {
			return "null";
		}
	}
	
}
