package Day2;

public class AnimalTest {

	public static void main(String[] args) {
		
		//using code input
		
		Animal a1=new Animal();
		a1.setName("Lion");
		a1.setAge(3);
		a1.setSpieces("Mammal");
		
		Animal a2=new Animal();
		a2.setAge(5);
		a2.setName("Anaconda");
		a2.setSpieces("Reptiles");
		
		a1.getAnimalLifestyle();
		a2.getAnimalLifestyle();
		
	//	System.out.println(a1.getName());
		//System.out.println(a2.getAge());
		
		
	}

}
