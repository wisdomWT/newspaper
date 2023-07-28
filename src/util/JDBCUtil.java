package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
     
	private static String url="jdbc:mysql://localhost:3306/newspaper_project?serverTimezone=GMT";
	private static String user = "root";
	private static String password = "123456";
	private static Connection conn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		
		try {
			if(null == conn|| conn.isClosed())
			
		    conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection getConnNewpaper() {
		
		try {
			if(null == conn|| conn.isClosed())
			
		    conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		try {
			if(null != rs) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			// 不管try中如何执行，finally都会执行
			try {
				if(null != pstmt) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if(null != conn) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
