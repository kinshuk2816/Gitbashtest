package Test;

import java.util.Scanner;

public class Nonrepeating {

	public static void main(String[] args) {
       
		Scanner s=new Scanner(System.in);
		
           System.out.println("Enter");
		 
		 String str=s.next();
		 
		 
	  boolean found = false;
		  for(int i = 0; i < str.length(); i++){
		   found = true;
		   char c = str.charAt(i);
		   //System.out.println("char " + c);
		   for(int j = 0; j < str.length(); j++){
		    //System.out.println("n-char " + str.charAt(j));
		    // if found then set the boolean field as false
		    // Also skip the char which is compared 
		    if(c == str.charAt(j) && j != i){
		     found = false;
		     break;
		    }
		   }
		   if(found){
		    System.out.println("Non repeating Character is "  + c);
		    break;
		   }
		  }
		  if(!found){
		   System.out.println("No single character found");
		  }
		  
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	}