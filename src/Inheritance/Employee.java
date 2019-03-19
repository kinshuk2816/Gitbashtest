package Inheritance;

public abstract class Employee {

	private int e_id;
	private String name;
	private int age;
	private double salary;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	void getEmployeeDetails() {
		
		
		System.out.println(this.name+" "+this.age+" "+this.salary+" "+this.e_id);
	}
	
	
}
