package com.jdbc1.StudentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class StudentDB {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner scanner = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String query = "insert into student(name, percentagel,address) values(?,?,?)"; 
			//Statement  statement = con.createStatement();
			
			//int executeUpdate = statement.executeUpdate(query);
			
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
		//	System.out.println(executeUpdate);
			
		//	System.out.println(executeUpdate);
			
			System.out.println("please enter the name ");
			preparedStatement.setString(1, scanner.next());
			
			System.out.println("please enter the percentage");
			preparedStatement.setDouble(2, scanner.nextDouble());
			
			
			System.out.println("please enter the address");
			preparedStatement.setString(3, scanner.next());
			
			int execute = preparedStatement.executeUpdate();
			System.out.println(execute);
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
	}

}
