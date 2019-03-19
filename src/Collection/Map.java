package Collection;

import java.util.*;

public class Map {

	public static void main(String[] args) {
                     
	HashMap k=new HashMap();
		
	   k.put(101, "Lol");
	   k.put(102, "Lmao");
	   k.put(103, "Rofl");
	   k.put(104, "Roflmao");
	   
		
		System.out.println(k.get(103));		
		
		System.out.println(k.size());
		
		Set s=k.entrySet();
		 Iterator i= s.iterator();
    
		 while(i.hasNext()) {
			System.out.println(i.next());
	}

		Set sk=k.keySet();
		
		Iterator it= sk.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
	}
		
		
		
		
		
	}}
