package Day2;
import java.util.*;

public class Animal {
	private String Name;	
	private String Spieces;
	private int age;
	
	 
	 
	 public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSpieces() {
		return Spieces;
	}

	public void setSpieces(String spieces) {
		Spieces = spieces;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//This is Zero Parametrised //
	 public Animal(){
		
	 }
	 
	 Animal(String Name,String Spieces,int age){
		 
		 this.Name=Name;
		 this.age=age;
		 this.Spieces=Spieces;
		 
		 
	 }
	void getAnimalLifestyle() {
	
	
	    System.out.println(this.Name+"  "+this.age+"  "+this.Spieces);
	
	
	}

	public static String getCount() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBreed(String breed) {
		// TODO Auto-generated method stub
		
	}
	          
	

}
