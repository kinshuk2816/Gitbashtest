package Account;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		
	/*//	Scanner s=new Scanner(System.in);
		person p1=new person();
		p1.setName("Smith");
		p1.setAge(41);
		//System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		
		
		Account1 a1=new Account1();
		a1.setAccholder(p1);
		a1.setBalance(2000);
		a1.setAccnum(Account1.getCounter());
		System.out.println(a1.getBalance());
		System.out.println(a1.getAccnum());
		
		person p2=new person();
		p2.setName("kathy");
		p2.setAge(35);
		//System.out.println(p2.getName());
		
		
		
		Account1 a2=new Account1();
		a2.setAccholder(p2);
		a2.setBalance(2000);
		a2.setAccnum(Account1.getCounter());
		
		System.out.println(a2.getAccnum());
		
		p1.getpersonDetails();
		p2.getpersonDetails();
		
	}*/

		
		
		
		
		
		

		        Scanner s = new Scanner(System.in);
		        Account1 arr[] = null ;

		        while (true) {
		            System.out.println("Enter your choice");
		            int option = s.nextInt();


		            switch (option) {


		                case 1:
		                    arr = addAccount1(arr);

		                    break;
		                case 2:

		                 arr=   dispalyAccount1(arr);
		                    break;

		                case 3:
		                    System.exit(0);
		                    break;

		                default:  System.out.println("Try again");
		            }
		        }
	}

	

	
			public static Account1[] addAccount1(Account1[] arr) {

		        Scanner s = new Scanner(System.in);

		        System.out.println("enter the arr size");
		        int count = s.nextInt();
		        arr = new Account1[count];
		        int i;

		        for (i=0; i<count; i++)
		        {

		            System.out.println("enter the account name");
		            String name = s.next();

		            System.out.println("enter the deposit");
		            int balance = s.nextInt();
		            System.out.println("enter the age");
		            int age = s.nextInt();

		            Account1 a1 = new Account1();


		         

		            a1.setBalance(balance);
		            a1.setPerson(name);
		            a1.setAccnum(Account1.getCounter());

		            arr[i] = a1;
		        }
		        return arr;

		    }

		    public static Account1[] dispalyAccount1(Account1[] arr) {

		        int i;
		        System.out.println("the arr is" + arr);

		        if (arr != null) {
		            for (i = 0; i < arr.length; i++) {
		                System.out.println(arr[i]);
		         
		            }
		     
		}
				return arr;

		
		
		
		
		}}

