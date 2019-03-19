package Assesments;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner s=  new Scanner(System.in);
		
		System.out.println("Enter the name:");
		
		String str=s.next();
		
		int count=0;
		
		char a='i';
		   for (int i = 0; i < str.length(); i++) {
			   
			   if(str.charAt(i)==a) {
				   count=count+1;
			   }
			 
			   
			
		}
		  
		   System.out.println(count);
		   
		
		
		

	}

}
