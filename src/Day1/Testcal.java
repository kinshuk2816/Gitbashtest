package Day1;

import java.util.*;
public class Testcal {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter first number");
		System.out.println("Please enter second number");
		int a = s.nextInt();
		
		int b = s.nextInt();
		s.close();
		
		
		calculator c=new calculator();
		
		
				System.out.println(c.Addition(a,b));
				System.out.println(c.Subtraction(a,b));
				System.out.println(c.Multiplication(a,b));
	}

}
