package Collection;

public class Reverse {

	public static void main(String[] args) {
		
		/*int a=20;
		int b=10;
		int temp;
		
		
		  temp = a;
	      a = b;
	      b = temp;
		
		
		System.out.println(b);
         System.out.println(a);*/
	
	       int x[]= {10,20,30,40};
	       
	       
	    
	
		for (int i = 0; i < x.length / 2; i++) {
			  int temp = x[i];
			  x[i] = x[x.length - 1 - i];
			  x[x.length - 1 - i] = temp;
			}
	              for (int j = 0; j < x.length; j++) {
					  System.out.println(x[j]);
				}
	              
		}

		
}