package com.netsong7.core2;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
	private static final String USER = "root";
	private static final String PW = "1111";
	
	@Test
	public void testConnection() throws ClassNotFoundException{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}
		catch(Exception err){
			System.out.println("연결 실패 : " + err);
		}
	}
}
