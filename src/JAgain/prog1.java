package JAgain;

public class prog1 {
	public static void main(String[] args) {

		
		String str="1245dgergr54geaa";
		int digit=0;
		int c=0;
	
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
				
				digit=digit+1;
			else {
				 c = c+1;
			}
			
			
		}
		
		System.out.println(digit+" "+c);
		
	}
	
}




