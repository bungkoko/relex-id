package id.ac.itb.ee.lskk.relexid.core;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * @author ceefour
 *
 */
public class LexMatchResult {
	
	public static final LexMatchResult MISMATCH = new LexMatchResult(); 
	
	private final boolean matched;

	/**
	 * Number of parts to advance due to matching, minimum is 1 if matches. 
	 */
	private final int advance;
	
	/**
	 * Capturing groups (if any).
	 */
	private final List<CapturingGroup> capturingGroups;

	public LexMatchResult(int advance,
			List<CapturingGroup> capturingGroups) {
		super();
		this.matched = true;
		this.advance = advance;
		Preconditions.checkArgument(advance >= 1, "If matched, then advance must be >= 1");
		this.capturingGroups = capturingGroups;
	}

	public LexMatchResult(int advance,
			CapturingGroup... capturingGroups) {
		this(advance, ImmutableList.copyOf(capturingGroups));
	}

	private LexMatchResult() {
		this.matched = false;
		this.advance = 0;
		this.capturingGroups = ImmutableList.<CapturingGroup>of();
	}
	
	public boolean isMatched() {
		return matched;
	}
	
	public int getAdvance() {
		return advance;
	}
	
	public List<CapturingGroup> getCapturingGroups() {
		return capturingGroups;
	}
	
	@Override
	public String toString() {
		return matched ? advance + " " + capturingGroups : "false";
	}

}
