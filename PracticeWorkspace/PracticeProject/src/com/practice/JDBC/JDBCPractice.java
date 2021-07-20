package com.practice.JDBC;

import java.sql.*;

public class JDBCPractice {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dbpassword");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from simlrnph2.users order by User_ID");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+": " + rs.getString(2) + "- has "+ rs.getInt(3) +" salary.");
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
