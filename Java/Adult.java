package question2;
import java.util.ArrayList;
public class Adult {
	private ArrayList<Integer> bYear;
	private ArrayList<String> Name;

	public void bYears(int n) { // birth year method used by child classes
		bYear = new ArrayList<Integer>();
		bYear.add(n);
	}
	public String toString() { // birth year array conversion to string, used by
								// child classes

		return bYear.toString();

	}
	public void addName(String nameadd) { // Adding name to array from child
											// classes
		Name = new ArrayList<String>();
		Name.add(nameadd);
	}
	public String toStringName() { // converting name array to string

		return Name.toString();

	}

}
