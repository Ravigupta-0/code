package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class PrepareSql {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "eeeb4074");
		System.out.println("Connection Estblished\n");
		Statement stm= dbcon.createStatement();
		ResultSet rs= stm.executeQuery("SELECT * FROM PersonDetails");
		PreparedStatement psmt = dbcon.prepareStatement("INSERT INTO PersonDetails VALUES(?,?,?)");
		System.out.println("Enter the id: \n");
		int a =sc.nextInt();
		psmt.setInt(1, a );
		System.out.println("Enter the balance amount: \n");
		double b= sc.nextDouble();
		psmt.setDouble(2, b );
		System.out.println("Enter the name: \n");
		String c = sc.next();
		psmt.setString(3, c );
 		
		int updates = psmt.executeUpdate();
		while(rs.next()) {
			int id =rs.getInt("ID");
			String  name = rs.getString("Name");
			double acc_bal = rs.getDouble("acc_bal");
			System.out.println(id+ "-"+name+" - "+acc_bal);
		}
		String sql="Update PersonDetails set Name ='Amit' where id =20 ";
		stm.executeUpdate(sql);
		psmt.close();
		rs.close();
		stm.close();
		dbcon.close();
	}

}
