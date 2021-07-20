package com.practice.JDBC;

import java.io.*;
import java.sql.*;

public class JDBCdataUpdatePractice2 {

	public static void main(String[] args) {

		boolean b1=true,b2=true;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dbpassword");
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("insert into simlrnph2.users values (?, ?, ?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter values:");
			while(b2) {
				System.out.println("User ID:");
				String id1 = br.readLine();
				int id = Integer.parseInt(id1);
				System.out.println("Name:");
				String name = br.readLine();
				System.out.println("Salary:");
				String sal = br.readLine();
				int salary = Integer.parseInt(sal);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setInt(3,salary);
				pstmt.executeUpdate();
				System.out.println("do you want to Commit/Rollback?");
				String answer;
				while(b1) {
					answer = br.readLine();
					if(answer.equals("Commit")) { 
						con.commit();
//						con.close(); 
						b1=false;}
					else if	(answer.equals("Rollback")) { 
						con.rollback();
//						con.close();
						b1=false;}
					else System.out.println("Please confirm Commit/Rollback");
				}
				System.out.println("Do you want to add more records? Y/N");
				b1=true;
				while(b1) {
					answer = br.readLine();
					if(answer.equals("n") || answer.equals("N")) { 
						b2=false;
						b1=false;}
					else if (answer.equals("y") || answer.equals("Y")) 
						b1=false;
					else System.out.println("Please confirm Y/N");
				}
				
			}
			System.out.println("Records updated. PFB:");
			ResultSet rs = pstmt.executeQuery("select * from simlrnph2.users order by user_id");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+": " + rs.getString(2) + "- has "+ rs.getInt(3) +" salary.");
			}
			con.close();
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
