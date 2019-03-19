package Inheritance;
import java.util.Scanner;
public class join {

	public static void main(String[] args) {

		
		
		Scanner s=new Scanner(System.in);
		
		Manager m=new Manager();
		System.out.println("Enter name");
	     String name=s.next();
	     m.setName(name);
	     
	     System.out.println("Enter age");
	    int age=s.nextInt();
	    m.setAge(age);
	    
	    System.out.println("Enter salary");
	    double salary=s.nextDouble();
	    m.setSalary(salary);
	    
	    
	    System.out.println("Enter E_id");
	     int e_id=s.nextInt();
	    m.setE_id(e_id);
	    
	    System.out.println("Enter number");
	    int number=s.nextInt();
	    m.setNumber(number);
	    
	    
	    
	      m.getEmployeeDetails();
		
		
	}

}
