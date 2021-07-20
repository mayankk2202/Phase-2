package com.practice.JDBC;

import java.sql.*;

public class JDBCdataUpdatePractice {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dbpassword");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into simlrnph2.users Values (7,'Name7',36000)");
			stmt.executeUpdate("insert into simlrnph2.users Values (8,'Name8',23700)");
			con.commit();
			
			ResultSet rs = stmt.executeQuery("select * from simlrnph2.users order by user_id");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+": " + rs.getString(2) + "- has "+ rs.getInt(3) +" salary.");
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
