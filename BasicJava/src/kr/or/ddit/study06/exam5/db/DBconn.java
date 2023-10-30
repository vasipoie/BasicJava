package kr.or.ddit.study06.exam5.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.*;

public class DBconn {
	static Connection conn = null;
	
	//접속 메소드
	//쿼리를 쓸때마다 db접속하면 낭비. 접속했으면 기존 정보 그대로 가져오려고 static사용
	//static은 클래스가 아무리 많아도 접속 1번 해줌
	public static Connection getConnection() {
		//jdbc:oracle:thin->공통. @ip:port:db정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc02";
		String pwd = "java";
		
		if(conn == null) {
			System.out.println("?");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,user,pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
