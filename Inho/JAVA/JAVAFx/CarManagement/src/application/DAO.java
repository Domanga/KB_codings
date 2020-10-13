package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	Connection conn = null;
	String dbname = "parking";
	Statement stmt = null;
	ResultSet rs = null;

	PreparedStatement pstmt = null;

	public void add(DTO dto) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/" + dbname + "?serverTimezone=UTC&allowPublicKeyRetrieval=true"
					+ "&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "0506");
			System.out.println("연결되었습니다.");

			stmt = conn.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
