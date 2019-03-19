package Assesments;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		  
		Scanner w = new Scanner(System.in);
		
		  System.out.print("Enter a number: ");
		
		  int num = w.nextInt();
		  int s=1;  
		  int sum=1;
		  
		  if(num>0) {
		  for(s=1;s<=num;s++)
		  {
		  
			  sum = sum*s;}
			  System.out.println(sum);
			  
			  
		  }
		  else 
		 {
			  
			  System.out.println("Wrong Input");
		  }
				  
		 
		  
		  }
		

	}


