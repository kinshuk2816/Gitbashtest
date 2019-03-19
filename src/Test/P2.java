package Test;

import java.util.ArrayList;
import java.util.Collections;

public class P2 {

	public static void main(String[] args) {
	
		
ArrayList Reverse=new ArrayList();
	
		
		Reverse.add("kinshuk");
		Reverse.add("vamsi");
		Reverse.add("akshay");
		Reverse.add("rishab");
		
		
	String temp;
		
	for(int i=0;i<Reverse.size()/2;i++) {
			temp=(String) Reverse.get(i);
    Reverse.set(i, Reverse.get(Reverse.size()-1-i));
     Reverse.set(Reverse.size()-1-i, temp);
			     
		}
	
                     
		System.out.println(Reverse);
		
		
		
		
	   }}


