package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistreverse {

	public static void main(String[] args) {
		
		ArrayList star=new ArrayList();
	
		
		star.add(10);
		star.add(20);
		star.add(5);
		star.add(7);
		star.add(17);
		
		//Normal OP
	/*	Iterator k=star.iterator();
		
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}*/
		
		//Reverse Plug-in
		/* Collections.reverse(star);
		System.out.println(star);*/
		
		
		
		
				for (int i = 0; i < star.size()/2; i++) {
					  int temp = (int) star.get(i);
					  star.set(i,star.get(star.size()-1-i));
					star.set(star.size()-1-i,temp);
					}
				
	                            System.out.println(star);
	
	}

	}


