package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byteread {

	public static void main(String[] args) {

		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Kinshuk\\eclipse-workspace\\JavaCore\\src\\FileHandling\\file.txt");
			FileOutputStream f1=new FileOutputStream("C:\\Users\\Kinshuk\\eclipse-workspace\\JavaCore\\src\\FileHandling\\file2.txt");
			
			
			int i;
			while((i=(f.read()))!=-1) {
					System.out.println((char)i);
		f1.write((char)i);
			}
			
			System.out.println(f.read());
			
		} catch (IOException e) {

			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
