package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class P3 {

	public static void main(String[] args) {

		   try {
			     Connection con= CreateConnection();
			
			    
			       
			     while (true) {
			   	Scanner s=new Scanner(System.in);
			
				System.out.println("Enter the choice");
			   	int option =s.nextInt();
			   	switch(option) {
			   	
			   	case 1: Display ();
			   	       break;
			   	
			   	
			   	case 2: Addbook();
			   	       break;
			   
			 
			   	
			   	case 3 : System.exit(0);
			   			
			   		con.close();
			   	
			   	
			   	}	}}
			   	catch (SQLException e) {

					e.printStackTrace();
			   	}
		
				
				
				}
				
		

		public static void Addbook() {

		try {
			
			
			Connection con=CreateConnection();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Bookid");
			int Bookid =s.nextInt();
			
			System.out.println("Enter the Bookname");
			String Bookname=s.next();
			
	        System.out.println("Enter Authorname");
			String Authorname=s.next();
		
			boolean flag = false;
			while(flag==false)
	             if(Pattern.matches("^[A-Za-z]+$",Authorname)==true)
	             {
	            	 System.out.println("OK");
	            	 flag=true;
	             }
	             else {
	            	flag=false;
			 System.out.println("Name can only contain alphabets");
		              Authorname=s.next();
		              
		              
		              
		              

		String sql5="Insert into Book values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql5);
			pstmt.setInt(1,Bookid);
			pstmt.setString(2,Bookname);
			pstmt.setString(3,Authorname);
			pstmt.executeUpdate();
			
			
			pstmt.close();
			con.close();
			
	             }
			}catch (SQLException e) {

				e.printStackTrace();
			}
			
		
		}
	
	
	
		
		public static void Display() {

		
		try {
			Connection con=CreateConnection();
		   String sql="select * from Book";
		   PreparedStatement pstmt=con.prepareStatement(sql);
		   ResultSet rs=pstmt.executeQuery();
		   
		   while(rs.next()) {
   System.out.println("Bookid ="+rs.getInt(1)+" "+"Bookname ="+rs.getString(2)+" "+"Authorname ="+rs.getString(3));
		   }
		
		   rs.close();
		   pstmt.close();
		   con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}
	}
		
		
		
	public static  Connection CreateConnection() {
		
		
		
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
               //create connection
			java.sql.Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","admin");
			
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;    
		
	}
	
}
