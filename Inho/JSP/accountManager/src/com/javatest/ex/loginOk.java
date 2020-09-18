package com.javatest.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginOk
 */
@WebServlet("/loginOk")
public class loginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public String id, pw, name, phone1, phone2, phone3, gender;

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginOk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");

		String query = "select * from member where id = '" + id + "' and pw = '" + pw + "'";
		System.out.println(query);

		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uid = "scott";
			String upw = "tiger";

			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				name = resultSet.getString("NAME");
				id = resultSet.getString("ID");
				pw = resultSet.getString("PW");
				phone1 = resultSet.getString("PHONE1");
				phone2 = resultSet.getString("PHONE2");
				phone3 = resultSet.getString("PHONE3");
				gender = resultSet.getString("GENDER");

				System.out.println("이름 : " + name + ", 아이디 : " + id + ", 비밀번호 : " + pw + ", 전화번호 : " + phone1
						+ " - " + phone2 + " - " + phone3 + ", 성별 :  " + gender);
			}

			if (name != null) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("name", name);
				httpSession.setAttribute("id", id);
				httpSession.setAttribute("pw", pw);
				
				response.sendRedirect("loginResult.jsp");
			} else {
				response.sendRedirect("login.html");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
