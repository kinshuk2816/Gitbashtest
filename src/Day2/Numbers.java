package Day2;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if(num > 0 )
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");
 

	}

}

