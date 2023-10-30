package kr.or.ddit.study06.exam5.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB정보 가져오기
public class DBconnService {
	Connection conn = null;
	Statement  stmt = null;
	ResultSet  rs   = null;
	
	public static void main(String[] args) {
		DBconnService dbs = new DBconnService();
		dbs.selectAll();
	}
	
	public EmpVO selectAll() {
		EmpVO emp = new EmpVO();
		conn = DBconn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT EMPID, NAME, DEPT FROM EMP";
			//result set - 데이터 총 몇개있는지
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String empid = rs.getString("EMPID");
				String name = rs.getString("NAME");
				String dept = rs.getString("DEPT");
				emp.setDept(dept);
				emp.setEmpid(empid);
				emp.setName(name);
				
				System.out.println(emp);
				
//				System.out.printf("%s\t%s\t%s\n",empid, name, dept);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
}
