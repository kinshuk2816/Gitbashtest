package JAgain;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
	/*	Circle c=new Circle();
		c.setRadius(10);
		     System.out.println("Circle Area:"+" "+c.CalculateArea());
		
		     
		     Square s=new Square();
		     s.setSide(10);
		System.out.println("Square Area:"+" "+s.CalculateArea());*/
		
		
		
		   Scanner input = new Scanner (System.in);
	       
		   System.out.print("How many rows: ");
	       
		   int rows = input.nextInt();
	       
		   for (int x = 1; x <= rows; x++)
	        {
	            for (int i = 1; i <= x; i++)
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
}}
