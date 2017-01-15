
public class NumberList {

	private int largest; //Initializing private variables
	private int smallest;

	public void Numbers() { 

		largest = Integer.MIN_VALUE;
		smallest = Integer.MAX_VALUE;

	}

	public void getLargest(int x, int y, int z, int t) { //Method to find largest value
		largest = Math.max(x, largest);
		largest = Math.max(y, largest);
		largest = Math.max(z, largest);
		largest = Math.max(t, largest);
	}
	public void getSmallest(int x, int y, int z, int t) { //Method to find smallest value
		smallest = Math.min(x, smallest); 
		smallest = Math.min(y, smallest);
		smallest = Math.min(z, smallest);
		smallest = Math.min(t, smallest);
	}
	public int returnLargest() { //Return value from getLargest
		return largest;
	}

	public int returnSmallest() { //Return value from getSmallest
		return smallest;
	}
}