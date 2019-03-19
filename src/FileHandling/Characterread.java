package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Characterread {

	public static void main(String[] args) {
              
		FileReader fis=null;
		FileWriter fos=null;
		
		try {
			
			
			
			 fis=new FileReader("C:\\Users\\Kinshuk\\eclipse-workspace\\JavaCore\\src\\FileHandling\\file.txt");
			 fos=new FileWriter("C:\\Users\\Kinshuk\\eclipse-workspace\\JavaCore\\src\\FileHandling\\char2.txt");
			
		
			 int i;
			while((i=(fis.read()))!=-1) {
					System.out.println((char)i);
		fos.write((char)i);
			}
			
			System.out.println(fis.read());
		} catch (IOException e) {

	
			e.printStackTrace();
		}
		finally {
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		}
		if(fos!=null)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
}

}
