package question2;

import java.util.ArrayList;

public class Worker extends Adult {
	private ArrayList<String> Job;

	public void addJob(String jobadd) { // constructing job array and adding
										// values from own class.
		Job = new ArrayList<String>();
		Job.add(jobadd);
	}

	public String toString() { // Converting array to method
		return Job.toString();
	}

	public void printOutW() { // Displaying and running methods with placeholder
								// values
		bYears(1985);
		addJob("Clerk");
		String WorkerName = "Worker Joe";
		super.addName(WorkerName);
		System.out.println("Name:" + toStringName());
		System.out.println("Job title:" + Job.toString());
		System.out.println("Birth Year:" + super.toString()); // Calling super
																// class's
																// toString
																// method (key
																// part of
																// assignment)

	}

}
