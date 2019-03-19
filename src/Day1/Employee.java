package Day1;
class Student{
	int id;  
	 String name; 
	 double salary;
}              
public class Employee {
	
	 
	public static void main(String[] args) {
		 Student s1=new Student();  
		  s1.id=101;  
		  s1.name="Kinshuk"; 
		  s1.salary=15000.22;
		  
		  Student s2=new Student();
		  s2.id=102;
		  s2.name="Vamsi";
		  s2.salary=15000.11;
		  System.out.println(s1.id+"    "+s1.name+"    "+s1.salary);
		  System.out.println(s2.id+"    "+s2.name+"     "+s2.salary);

	}

}
