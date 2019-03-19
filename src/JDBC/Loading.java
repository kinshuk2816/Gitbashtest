package JDBC;
import java.util.*;
import java.sql.*;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Loading {

	public static void main(String[] args) {

		
			
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
               //create connection
			java.sql.Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","admin");
			
			System.out.println("Success");
		
			java.sql.Statement stmt= con.createStatement();
			
	/*		String sql="Insert into Employee values(104,'kinshuk',13000,'Jammu','suzuki')";
		int i =	 stmt.executeUpdate(sql);*/
		
		/*String sql1="Delete from Employee  where EmployeeId=101";
		int i= stmt.executeUpdate(sql1);
				
				
		System.out.println("the value of inserted row are "+i);*/
		
			/* String sql3="Select name,Salary from Employee ";
			ResultSet rs=stmt.executeQuery(sql3);
			
			while(rs.next()) {
				
				System.out.println("Employee names  are  "+ rs.getString(1) + "   "+rs.getInt(2));
			}*/
			
			
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the choice");
			
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
			
			
			
			String sql5="Insert into Employee values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql5);
			pstmt.setInt(1,EmployeeId);
			pstmt.setString(2,name);
			pstmt.setInt(3,Salary);
			pstmt.setString(4,City);
			pstmt.setString(5,Vehicle);
			int i=pstmt.executeUpdate();
			
			
		stmt.close();
		con.close();
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
	}

}
