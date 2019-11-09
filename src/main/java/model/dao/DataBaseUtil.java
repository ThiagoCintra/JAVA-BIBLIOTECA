package model.dao;

import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {

	private static Connection cn = null;
	private static PreparedStatement pr = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private static String url = "jdbc:mysql://localhost/teste?useTimezone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String senha = "root";
	
	public static  Connection getConnection() throws SQLException {
		cn =  DriverManager.getConnection(url,user,senha);
		return cn;
	}
	
	public static void closeAll() throws SQLException {
//		if(!rs.equals(null)) {
//			System.out.println("Fechando ResultSet");
//			rs.close();
//		}
//		
//		if (!st.equals(null)) {
//			System.out.println("Fechando Statement");
//			pr.close();
//		}
		
		if(!pr.equals(null)) {
			System.out.println("Fechando PrepareStatement");
			pr.close();
		}
		if (!cn.equals(null)) {
			System.out.println("Fechando conecção BD");
			cn.close();
		}
		
	}
	
	public static void setPrepareStatement(String txt) throws SQLException {
		pr = getConnection().prepareStatement(txt);
	}
	
	public static PreparedStatement getPreparedStatement() {
		return pr;
		
	}
	
	
	
}
