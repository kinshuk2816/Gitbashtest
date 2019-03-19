package Collection;

import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;



public class LHashMap {

	public static void main(String[] args) {

		
		LinkedHashMap<Integer, String> h =  new LinkedHashMap<Integer, String>(); 
                                           
 h.put(102, "Rofl"); 
 h.put(103, "lol"); 
 h.put(104, "lmao"); 
h.put(107, "Roflmao");
    Set s=h.keySet();
 
 Iterator k=s.iterator();
	
	
	while(k.hasNext()) {
		Integer in =(Integer)k.next();
		System.out.println("key: "+ in + "  value:  "+ h.get(in));
		
		
		
		
		
		//System.out.println(k.next());
 //System.out.println(h); 

 
 
} 
	}}

		
		
		
	


