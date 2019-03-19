package Test;

public class Replace {

	public static void main(String[] args) {

		
		String str="Hello this is the replace program";
		System.out.println(str);
		
		   int i;
		for ( i = 0; i < str.length(); i++) {
		 if(str.charAt(i) !=' ') {    
			 str=(str.replace(str.charAt(i), 'I'));
		                                
			 }else {
				    str=str.replace(' ', ' ');
						 }
		 //inside for loop for step by step answer
		//	System.out.println(str);

	 }
		//Outside loop for one answer
		System.out.println(str);
		
	
	}

}
