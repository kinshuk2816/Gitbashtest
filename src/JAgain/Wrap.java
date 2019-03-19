package JAgain;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Wrap {
        
	public static void main(String[] args) {
		
		/*int i=13;
		Integer obj=Integer .valueOf(i);
		System.out.println(obj);
		
		
		System.out.println(obj);*/
         
		System.out.println("Enter the Age:");
		
		Scanner s= new Scanner(System.in);
		String age=s.next();
		 while(true)
		if(Pattern.matches("^[0-9]+$", age)) {
			int a=Integer.parseInt(age);
			break;
			
		}else {
			      System.out.println("Bhai pk hai kya.......");
		break;  
		}
		
		
		
		}
	
	
	}



        