//Mackenzie Clarkson
//Assignment 2
//Oct 16 2016
//Number List Problem #1

import java.util.Scanner;
public class myMainNum 
{

	// My main class that calls all methods and prints results
	public static void main(String[] args) 
	{
		int fnum1, fnum2, fnum3, fnum4;
		Scanner inputNum = new Scanner(System.in); //For user input
		System.out.println("Please enter an integer");
		fnum1 = inputNum.nextInt();
		System.out.println("Please enter an integer");
		fnum2 = inputNum.nextInt();
		System.out.println("Please enter an integer");
		fnum3 = inputNum.nextInt();
		System.out.println("Please enter an integer");
		fnum4 = inputNum.nextInt();
		NumberList call = new NumberList(); //Constructor
		call.Numbers();
		call.getSmallest(fnum1, fnum2, fnum3, fnum4); //Call methods with user inputs
		call.getLargest(fnum1, fnum2, fnum3, fnum4);
		int l = call.returnLargest();
		int s = call.returnSmallest();
		System.out.printf("Largest: %s", l); //Print result
		System.out.printf(" Smallest: %s", s);

	}
}