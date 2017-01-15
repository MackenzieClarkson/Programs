package question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void testToString() { // Testing method of interest

		Manager test = new Manager();
		test.addSalary(30000);
		test.toString();
		String salary = test.toString();
		String expected = "[30000]";
		assertEquals(expected, salary);
	}

}
