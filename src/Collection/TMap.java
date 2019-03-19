package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TMap {

	public static void main(String[] args) {

        TreeMap <Integer, String> t = new TreeMap <Integer, String>(); 
                           
        t.put(1, "Wow"); 
        t.put(15, "it"); 
        t.put(27, "is"); 
        t.put(13, "awesome"); 
        t.put(8, "4"); 
  
        
  
        System.out.println(" Value : " + t.get(27)); 
  
        System.out.println(" Value : " + t.get(13)); 
        
        
   		System.out.println("descendingMap: "+t.descendingMap());  

        Set s=t.keySet();
        
        Iterator k=s.iterator();
       	
       	
       	while(k.hasNext()) {
       		Integer in =(Integer)k.next();
       		System.out.println("key: "+ in + "  value:  "+ t.get(in));
       		
    } }
		
	}


