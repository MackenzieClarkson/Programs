package question2;

import java.util.ArrayList;

public class Manager extends Adult {
	private ArrayList<Integer> salary;

	public void addSalary(int x) { // pulling salary from own class
		salary = new ArrayList<Integer>();
		salary.add(x);
	}
	public String toString() { // converting array to string

		return salary.toString();
	}
	public void printOutM() { // Displaying and running placeholder values in
								// methods.
		addSalary(50000);
		bYears(1968);
		String ManagerName = "Manager Kelly";
		super.addName(ManagerName);
		System.out.println("Name:" + toStringName());
		System.out.println("Birth Year:" + super.toString()); // Calling super
																// class's
																// toString
																// method (key
																// part of
																// assignment)
		System.out.println("Salary:" + toString());

	}

}