package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;

public class JDBCExample {
	
	public static void main(String[] args) {
		final String query = "select * from student";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/JDBCTraining";
			String username = "root";
			String password = "dinesh";
			Connection conn= 	DriverManager.getConnection(url, username, password);
			Statement s = conn.createStatement();
			ResultSet rs = s. executeQuery(query);
			System.out.println(rs);
			ResultSetMetaData rsm = rs.getMetaData();
			while(rs.next()){
				int id = rs.getInt("id");
				System.out.println("Student ID: "+rs.getString("id"));
				System.out.println("First Name: "+rs.getString(2));
				System.out.println("Last name: "+rs.getString(3));
				System.out.println("email: "+rs.getString(4));
				System.out.println("branch: "+rs.getString(5));
				System.out.println("grade: "+rs.getString(6));
				System.out.println("age: "+rs.getString(7));
				
			}
			System.out.println("Column name "+rsm.getColumnLabel(1));
			System.out.println("column type: "+rsm.getColumnTypeName(1));
			System.out.println("is nullable: "+rsm.isNullable(1));
			
			//String insert = "INSERT INTO `JDBCTraining`.`Student` (`ID`, `firstname`, `lastname`, `email`, `branch`, `overall_grade`,`age`) VALUES ('2', 's', 's', 's', 's', 's','21')";
			//s.execute(insert);
			String prepare_insert = "INSERT INTO `Student` (`ID`, `firstname`, `lastname`, `email`, `branch`, `overall_grade`,`age`) VALUES (?, ?, ?, ?, ?, ?,?)";
			PreparedStatement ps = conn.prepareStatement(prepare_insert);
			ps.setInt(1, 3);
			ps.setString(2, "surendra");
			ps.setString(3, "Surendra");
			ps.setString(4, "Surendra");
			ps.setString(5, "Surendra");
			ps.setString(6, "A");
			ps.setInt(7, 22);
			//ps.execute();
			
			DatabaseMetaData dbm = conn.getMetaData();
			System.out.println(dbm.getDatabaseMajorVersion());
			System.out.println(dbm.getDatabaseMinorVersion());
			System.out.println(dbm.getTables(null, "JDBCTraining", "Studnet", null));
			//conn.prepareCall(sql)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
