package Day2;

import java.util.*;
public class AnimalC {
   
	//using use input
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String Name=s.next();
		System.out.println("Enter age");
		int age=s.nextInt();
		System.out.println("Enter speices");
		String Spieces=s.next();
		s.close();
		
		Animal a1=new Animal();
		a1.setName(Name);
		a1.setAge(age);
		a1.setSpieces(Spieces);
		
		
		a1.getAnimalLifestyle();

		
		
		
	}
	
	
}
