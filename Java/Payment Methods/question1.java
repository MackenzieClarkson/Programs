//Mackenzie Clarkson
//Assignment 4
//November 27 2016
/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class question1 {
	public static void main(String[] args){
				
		int y=0; //to initiate do task for try to open file
			
		do{	 
			try{
				Scanner input = new Scanner(System.in);
				System.out.println("Beginning of Day");
				System.out.println("Cash?");
				double cashin = input.nextDouble(); //beginning of day's cash
				System.out.println("File name?");
				String filename = input.next();//File that contains day's invoices
				System.out.println("End of Day"); 
				System.out.println("Cash?");
				double cashend = input.nextDouble(); //Cash at the end of the day
				double expected = cashin+addCash(filename); //Calculating what is expected, incorporating 
															//the pre-existing invoices and starting cash
				System.out.println("Expected Cash : " + expected); 			
				System.out.println("Difference from cash end:" + (cashend - expected));
				y=1;
			}
				
				catch(Exception e){
					System.out.println("Invalid Input");
					}
			
			}while(y==0); //if full try goes through will only run once
				
	}
	
public static double addCash(String fileName){ //importing fileName from main
	int x = 1;
	File inputFile = new File(fileName); //importing fileName from main
	double sumCash = 0;
	do{
		try {
			Scanner in = new Scanner(inputFile);
				while (in.hasNext()){ //checking all values in file
					in.nextDouble(); //invoice number
					double cashamount = in.nextDouble(); //cash amount
					String paid = in.next();//P or R paid or received
					if(paid.equals("R")){ //if R add to cash total
					sumCash = (sumCash + cashamount);
						
					}
					else if(paid.equals("P")){ //if paid take away from total
						sumCash = (sumCash - cashamount);
						
				}
			}
		 in.close();
		 x=2; //end loop
		}
	
catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	return sumCash; //return cash total from file
}while(x==1); //end loop


	}
}*/