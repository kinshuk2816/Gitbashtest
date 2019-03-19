package Assesments;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		  
		Scanner w = new Scanner(System.in);
		
		  System.out.print("Enter a number: ");
		           
		  int num = w.nextInt();
		  int a=0,b=1;
		  
		  int i=1;
	        while(i<=num)
	        {
	            System.out.print(a+" ");
	            int sum = a + b;
	            a = b;
	            b = sum;;
	            i++;
		 
	        }
		

	}

}
