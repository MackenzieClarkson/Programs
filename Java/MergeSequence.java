//Mackenzie Clarkson
//Nov 13 2016
//OOP Assignment 3

package assign3;
import java.util.ArrayList;
public class MergeSequence {
	
		private ArrayList<Integer> values;
		
		public MergeSequence () {  
			values = new ArrayList<Integer>(); //Constructing main array
			
		}
		
		public void add(int n) { //method to add values to array
			values.add(n); 
		}
		public String toString() { //Converting array to string
			
			return values.toString(); 
			}

		public void sequenceOne(){ //adding sequence to array then calling converting to string method
			values.add(1);
			values.add(4);
			values.add(9);
			values.add(16);
			values.toString();
			}
		public void sequenceTwo(){ //adding sequence to array then calling converting to string method
			values.add(9);
			values.add(7);
			values.add(4);
			values.add(9);
			values.add(11);
			values.toString();
					
			}
	
		
		public static void main(String[] args) {
			MergeSequence call = new MergeSequence();
			call.sequenceOne();
			call.sequenceTwo();
			System.out.println(call.toString());
			
		}
}