package Assesments;

import java.util.Scanner;

public class Arrayofnames {

	public static void main(String[] args) {

		String[] Name= {"vamsi","vatssal","Dishant","Manya"};
		
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Eter the name");
		
		String str=s.next();
		
		
		for (int i = 0; i < Name.length; i++) {
			
			if(str.equalsIgnoreCase(Name[i])) {
			
			flag=true;
	       break;
			
		}
		else 
		{
			
			flag=false;
		}
		
			}
		if(flag)
			System.out.println("found");
		else {
			System.out.println("Not");
		}

	}}
