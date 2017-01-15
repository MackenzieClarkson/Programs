//Mackenzie Clarkson
//Assignment 4
//November 27 2016
import java.*;
public class question3 {

public static void main(String[] args){
result();
}
	public static void result(){
		String match= "match";
		String sbs= "at";
	
	if (find(match,sbs)){
	
		System.out.println(sbs + " is a substring of " + match);
		
	}else{
			System.out.println(sbs + " is not a substring of " + match);
		}
	}
	
	public static boolean find(String match,String sub){   
		
		if ((sub == null) || (match == null) || match.isEmpty()) {
	        return false; //If the eventual recursion runs out of substring space will return false
	    }
		
		else if (match.startsWith(sub)){ //Check to see if exact match
	        return true;
	    }
	    else{     
	    	 return find(match.substring(1), sub); //Recursion line. checking for
	    	           								//other possible substrings
	    	}
	    }
		
		
}
