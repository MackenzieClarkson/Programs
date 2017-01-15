//Mackenzie Clarkson
//Assignment 4
//November 27 2016
package question2;

public class Demo {
		 public static void main(String args[]) {
		 /* Create two objects using constructor */
		 Payments visaPymts = new VISA(100);
		 Payments masterPymts = new MC(200);
		 Payments debitPymts = new DEBIT(400);

		// Invoking a method for each object created
		 visaPymts.PaymentInfo();
		 masterPymts.PaymentInfo();
		 debitPymts.PaymentInfo();

		int totalAmount = visaPymts.getAmount() + masterPymts.getAmount() +
		debitPymts.getAmount();
		System.out.println("The total amount you paid is:" + totalAmount);
		 }
		}


