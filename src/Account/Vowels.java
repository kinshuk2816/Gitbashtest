package Account;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
   String str="";
   int a=0;
		Scanner s=new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
		String n=s.next();
		
		
		
		 for(int i=0;i<n.length();++i)
		  {
		   switch(n.charAt(i))
		   {
		    case 'a':
		    case 'A':
		    case 'e':
		    case 'E':
		    case 'i':
		    case 'I':
		    case 'o':
		    case 'O':    
		    case 'u':
		    case 'U': a++;  
		   }
		  }
		 
		  System.out.println("Number of vowels are "+a);
		 }
             
            	  
            	  
            	  
              
		
	}


