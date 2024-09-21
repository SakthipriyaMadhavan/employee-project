package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection connectWithDb() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Sakthi@0709");
			}
			
			catch(ClassNotFoundException e)
			{
				System.out.println("there is a pb: "+e);
			}
			catch(SQLException e)
			{
				System.out.println(" now there is a pb: "+e);
			}
		return con;
			
		}
	}


