package Day2;

import java.util.Scanner;

public class Animalloop {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		  System.out.println("Enter numbe of Animals");
		  int n=s.nextInt();
		  
		Animal arr[]=new Animal[n];  
		  
		
		
	     
		 for(int i = 0;i<n;i++) {
			 Animal a1=new Animal();
			 System.out.println("Enter name");
				String Name=s.next();
				System.out.println("Enter age");
				int age=s.nextInt();
				System.out.println("Enter speices");
				String Spieces=s.next();
				
			
				
				a1.setName(Name);
				a1.setAge(age);
				a1.setSpieces(Spieces);
				
				arr[i]=a1;
				
				 
			     }
				  System.out.println();
		
	}

}
