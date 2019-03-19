package Exception;

import java.util.Scanner;
import java.io.*;

public class Airthmetic {

	public static void main(String[] args) {
		//int x,y;
		/*Scanner s=new Scanner(System.in);
		    System.out.println("Enter the value of a");
		    
		    double x=s.nextInt();
		    
	    System.out.println("Enter value of b");
		    double y=s.nextInt();
		    
		   if(y!=0) {
		    double d=(x/y);
		    System.out.println(d);
		   }
		    else
		    {
		    	System.out.println("Not Defined");
		    }*/
		    
		/*    try {
		    	double d=(x/y);
		    	System.out.println(d);
		    }
		    
		    catch(ArithmeticException e){
		    	System.out.println(e);
		    }*/
		    
		    
		    /*  String str=null;
		      if(str!=null)
		      System.out.println(str.length());
		      else {
		    	  System.out.println("LOL");
		      }*/
		      
		/*try {
			FileReader f=new FileReader("abc.text");
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}*/
		
		
		
		String str1=("IIHT");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		String a=s.next();
		if(a!=null && a.equalsIgnoreCase(str1)) {
			System.out.println("match");
		}
		else
		{
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
	}

}
