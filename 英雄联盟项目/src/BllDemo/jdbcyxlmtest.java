package BllDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.StatementEvent;

public class jdbcyxlmtest {

	static String ul = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String url = "jdbc:sqlserver://localhost;databaseName=Nc";
	static String user = "sa";
	static String password = "libin520";

	// 把驱动程序放到静态代码块类被加载就会执行里面的代码块
	static {
		try {
			Class.forName(jdbcyxlmtest.ul);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection su() {
		try {
			return DriverManager.getConnection(jdbcyxlmtest.url, jdbcyxlmtest.user, jdbcyxlmtest.password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void sfzy(Connection connection,Statement createStatement) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(createStatement !=null) {
			try {
				createStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
}
