package guitarsearch.domain;

import java.sql.*;

public class JdbcConn {
	public static Connection getJdbcConn(){
		Connection conn = null;
		// 使用路径时，请使用该项目在电脑存储下的绝对路径
		String url = "jdbc:sqlite://D:/MyWebProject/workspace/GuitarSearch2.1/guitar.db";
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
