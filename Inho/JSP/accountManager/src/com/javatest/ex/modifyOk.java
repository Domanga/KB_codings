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
 * Servlet implementation class modifyOk
 */
@WebServlet("/modifyOk")
public class modifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String id, pw, name, phone1, phone2, phone3, gender;

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	HttpSession httpSession;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public modifyOk() {
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
		
		httpSession = request.getSession();
		
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");

		String query = "update member set name = '" + name + "', phone1 = '" + phone1 + "', phone2 = '" + phone2
				+ "', phone3 = '" + phone3 + "', gender = '" + gender + "' where id = '" + id + "'";
		System.out.println(query);

		if (pwConfirm()) {
			try {
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String uid = "scott";
				String upw = "tiger";

				Class.forName(driver);
				connection = DriverManager.getConnection(url, uid, upw);
				statement = connection.createStatement();
				int i = statement.executeUpdate(query);

				if (i == 1) {
					System.out.println("수정 성공");
					response.sendRedirect("modifyResult.jsp");
				} else {
					System.out.println("수정 실패");
					response.sendRedirect("modify.jsp");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				try {
					if (statement != null) {
						statement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("에러임");
		}
	}

	private boolean pwConfirm() {
		String sessionPW = (String) httpSession.getAttribute("pw");

		if (sessionPW.equals(pw)) {
			return true;
		} else {
			return false;
		}
	}
}
