package Switch;
import java.util.*;
import java.util.regex.Pattern; 
public class validate {

	public static void main(String[] args) {

		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name");
		
		String x= s.next();
		
		int limit=0;
		
		boolean flag = false;
		while(flag==false)
             if(Pattern.matches("^[A-Za-z]+$",x)==true)
             {
            	 System.out.println("OK");
            	 flag=true;
             }
             else {
            	 System.out.println("Fail");
		flag=false;
            	 System.out.println("Enter valid  value");
	                 x=s.next();
	               
	           
	
             }
		   if(limit==2) 
		 		System.out.println("Chal Nikal Zukerberg ke...............");
		 		System.exit(0);
		     {}
	
	
	
	}   
}


