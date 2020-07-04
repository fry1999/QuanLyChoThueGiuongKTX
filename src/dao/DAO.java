package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection con;
	
	public DAO() {
		if(con == null) {
			String dbUrl = "jdbc:mysql://localhost:3306/quanlychothuegiuongktx?autoReconnect=true&useSSL=false";
			String dbClass = "com.mysql.jdbc.Driver";
			
			try {
				Class.forName(dbClass);
				try {
					con = DriverManager.getConnection(dbUrl, "root","123456");	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
