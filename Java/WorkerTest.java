package question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkerTest {

	@Test
	public void testToString() { // Testing method of interest
		Worker test = new Worker();
		test.addJob("Sales");
		test.toString();
		String job = test.toString();
		String expected = "[Sales]";
		assertEquals(expected, job);
	}

}
