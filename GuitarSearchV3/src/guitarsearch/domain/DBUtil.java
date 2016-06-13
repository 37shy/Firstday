package guitarsearch.domain;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getSqliteConn() {
		String url = "jdbc:sqlite://E:/JavaEE/WorkSpace/GuitarSearchV3/guitar.db";
		Connection conn = null;
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;			
	}
	
	public static Connection getMySqlConn(){
		String userName = "sa";
		String password = "123456";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:mysql://localhost:3306/guitar.db";
		Connection conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;			
	}
	
}
