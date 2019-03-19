package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;


public class Loading2 {

	public static void main(String[] args) {
            try {
		     Connection con= CreateConnection();
		
		    
		       
		     while (true) {
		   	Scanner s=new Scanner(System.in);
		
			System.out.println("Enter the choice");
		   	int option =s.nextInt();
		   	switch(option) {
		   	
		   	case 1: Insert();
		   	       break;
		   	
		   	
		   	case 2: Display();
		   	       break;
		   
		   	case 3: Update();
		   	      break; 
		   	
		   	case 4 : System.exit(0);
		   			
		   	
		   	
		   	con.close();
		   	
		   	
		   	}	}}
		   	catch (SQLException e) {

				e.printStackTrace();
		   	}
	
			
			
			}
			
	
	
	public static  Connection CreateConnection() {
		
		
		
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
               //create connection
			java.sql.Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","admin");
			System.out.println("running");
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;    
		
	}
	
	
	
	
	public static void Insert() {
		
		try {
			
		
		Connection con=CreateConnection();
	Scanner s=new Scanner(System.in);
		
	
		
		System.out.println("Enter EmployeeId");
		int EmployeeId =s.nextInt();
		
		System.out.println("Enter the name");
		String name=s.next();
		
		System.out.println("Enter Salary");
		int Salary=s.nextInt();
		
		

		System.out.println("Enter City");
		String City=s.next();
		

		System.out.println("Enter Vehicle");
		String Vehicle=s.next();
		
		
		//String sql4="Insert into Employee values(EmployeeId,name,Salary,City,Vehicle)";
		
		String sql2="select * from Employee where EmployeeId =?";
		PreparedStatement pstmt=con.prepareStatement(sql2);
		ResultSet rs=pstmt.executeQuery();
		boolean flag = true;
		while(rs.next()) {
			flag =true;
			break;
			}
		
			if(flag){
				System.out.println("Please Enter new EmployeeId");
			pstmt.close();}
		
		else {
			String sql1="Insert into Employee values(?,?,?,?,?)";
			pstmt.close();
		}
		
		
		String sql5="Insert into Employee values(?,?,?,?,?)";
		PreparedStatement pstmt1=con.prepareStatement(sql5);
		pstmt.setInt(1,EmployeeId);
		pstmt.setString(2,name);
		pstmt.setInt(3,Salary);
		pstmt.setString(4,City);
		pstmt.setString(5,Vehicle);
		pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		}catch (SQLException e) {

			e.printStackTrace();
		}
		
	
	}
	
	public static void Display() {
		
		try {
			Connection con=CreateConnection();
		   String sql="select * from Employee";
		   PreparedStatement pstmt=con.prepareStatement(sql);
		   ResultSet rs=pstmt.executeQuery();
		   
		   while(rs.next()) {
   System.out.println("EmployeeId ="+rs.getInt(1)+"  "+"name = "+ rs.getString(2)+" "+"Salary = "+ rs.getInt(3)+"  "+"City ="+rs.getString(4)+" "+"Vehicle = "+rs.getString(5));
		   }
		
		   rs.close();
		   pstmt.close();
		   con.close();
		}catch (SQLException e) {

			e.printStackTrace();
		}
	}
		
		public static void Update() {
		
		    
			try {
				Connection con=CreateConnection();
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the EmployeeId");
			int EmployeeId =s.nextInt();
			
			System.out.println("Enter the new name");
			String name=s.next();
			
			 String sql="Update Employee set name=? where EmployeeId=?" ;
			   PreparedStatement pstmt=con.prepareStatement(sql);
                    pstmt.setInt(2, EmployeeId);
                    pstmt.setString(1,name);
                    pstmt.executeUpdate();
                    pstmt.close();
                    con.close();
				
				
				
				
				
			}catch (SQLException e) {

				e.printStackTrace();
			}
			
}
	
	/*	public static void Delete() {
			
			try {
				Connection con=CreateConnection();
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the EmployeeId");
			int EmployeeId =s.nextInt();
			
			 String sql="Delete Employee set name=? where EmployeeId=?" ;
			   PreparedStatement pstmt=con.prepareStatement(sql);
                  pstmt.setInt(2, EmployeeId);
                  pstmt.setString(1,name);
                  pstmt.executeUpdate();
                  pstmt.close();
                  con.close();

		
	
		}catch (SQLException e) {

			e.printStackTrace();
		}
	
	
		}*/
	
}








			
			
	
		
		
	
	


