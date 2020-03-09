package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcMySQL {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "eeeb4074");
		System.out.println("Connection Estblished\n");
		Statement stm= dbcon.createStatement();
		ResultSet rs= stm.executeQuery("SELECT * FROM PersonDetails");
		
		while(rs.next()){
			int id =rs.getInt("ID");
			String  name = rs.getString("Name");
			double acc_bal = rs.getDouble("acc_bal");
			System.out.println(id+ "-"+name+" - "+acc_bal);
		}
		String sql="Update PersonDetails set Name ='Amit' where id =20 ";
		stm.executeUpdate(sql);
		rs.close();
		stm.close();
		dbcon.close();
	}
}
 