package com.contactus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ContactDBUtil {
	
	public static boolean insertemployee(String name,String phone,String email,String dec) {
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/ecommerce_cart";
		String user = "root";
		String pass = "sliit";
		
		
		try{

			Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt  = con.createStatement();
			String sql = "insert into contactus values (0, '"+name+"','"+phone+"',  '"+email+"', '"+dec+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	

}
