package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Sorting {

	public static void main(String[] args) {
		
ArrayList star=new ArrayList();
		    
		
		star.add(13);
		star.add(8);
		star.add(17);
		star.add(22);
		star.add(19);
		
		Iterator k=star.iterator();
		
		System.out.println("Without Sorting:"+" "+ star);
		//while(k.hasNext()) {
		//	System.out.println(k.next());
	//	}

		int temp;
		      for (int i = 0; i < star.size(); i++) {
				for (int j = 0; j < star.size()-1-i; j++) {
				if((int) star.get(j)<(int)star.get(j+1)) {
					temp=(int)star.get(j);
					star.set(j,(int) star.get(j+1));
					star.set(j+1, temp);
				}
				
				}
		    	  
			}
		System.out.println("After Sorting: "+" "+star);
		
		
	}

}
