//Mackenzie Clarkson
//Nov 13 2016
//OOP Assignment 3

package question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){ //Main class 
		Scanner input = new Scanner(System.in);
		Manager call = new Manager();	//Constructors to use child class methods
		Worker callW = new Worker();
		System.out.println("Enter 1 for manager 2 for worker.");
		int choice = input.nextInt(); 
		if(choice == 1){ //Filter for using either manager or worker methods
			call.printOutM(); //manager methods
			
		}
		else if(choice == 2){
			callW.printOutW(); //worker methods
		
		}
		else{
			System.out.println("Invalid input");
		}
		
	}

	
}
