package assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSequenceTest {

	@Test
	public void testToString() { // Testing method of interest
		MergeSequence test = new MergeSequence();
		test.sequenceOne();
		test.sequenceTwo();
		String merged = test.toString();
		String expected = "[1, 4, 9, 16, 9, 7, 4, 9, 11]";
		assertEquals(expected, merged);

	}
}
