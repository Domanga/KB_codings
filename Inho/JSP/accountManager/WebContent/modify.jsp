<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	String name, id, pw, phone1, phone2, phone3, gender;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	id = (String) session.getAttribute("id");

	String query = "select * from member where id = '" + id + "'";
	System.out.println(query);
	
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

	}
	System.out.println("id : " + id + " pw : " + pw + " name : " + name);
%>

<form action="modifyOk" method="post">
	이름 : <input type="text" name="name" size="10" value=<%=name %>> <br/>
	아이디 : <input type="text" name="id" size="10" value=<%=id %> readonly="readonly"> <br/>
	비밀번호 : <input type="password" name="pw" size="10" value=<%=id %> readonly="readonly"> <br/>
	전화번호 : <select name="phone1">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			</select> - 
			<input type="text" name="phone2" size="5" value=<%=phone2 %>>
			- <input type="text" name="phone3" size="5" value=<%=phone3 %>>		
	<% if(gender.equals("man")) { %>
		성별 : <input	type="radio" name="gender" value="man" checked="checked">남
			  <input type="radio" name="gender" value="woman">여
	<% } else {%>
			 <input type="radio" name="gender" value="man">남
			 <input type="radio" name="gender" value="woman" checked="checked">여
	<% } %>
	<input type="submit" value="정보수정" > &nbsp; <input type="reset" value="취소">
</form>
</body>
</html>