package com.testconnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.applicationcontext.getBeanNew;
import com.mysql.jdbc.Connection;

public class TestConnection {
	private Connection connection;
	private getBeanNew context;
	@Autowired
	@Qualifier("db")
	private TestDatabase db;
	public void getConnection()
	{
		try 
		{
//			TestDatabase db = (TestDatabase) context.getBean("db");
			System.out.println("abc: "+db.getName());
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(db.getUrl(), db.getName(), db.getPassword());
			System.out.println("Connection complete.....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
		}
	}
	public static void main(String[] args) {
		TestConnection ob = new TestConnection();
		ob.getConnection();
	}
}
