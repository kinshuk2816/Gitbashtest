package Inheritance;

public class Manager extends Employee {

	private int number ;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	void getEmployeeDetails() {
		super.getEmployeeDetails();
	   System.out.println(this.number);
}
}