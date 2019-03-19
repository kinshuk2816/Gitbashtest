package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class P1 {

	public static void main(String[] args) {
		
		ArrayList star=new ArrayList();
		    
		
		star.add("vamsi");
		star.add("vatsal");
		star.add(5);
		star.add("Kawasaki");
		star.add(true);
		
		Iterator k=star.iterator();
		
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		System.out.println(star.get(3));
			
		
	
	               
	

	ArrayList sun=new ArrayList();
	
	       sun.add(3);
	       sun.add(25);
	       sun.add(47);
	       sun.add(8);
	       
	   /*    Iterator a=sun.iterator();
	   	while(a.hasNext()) {
			System.out.println(a.next());
		}*/
	   	
	       	 
	   	
	      Collections.sort(sun); 
		System.out.println(sun);
	 
	}
	       
	       
	       
	  
	       
	}


