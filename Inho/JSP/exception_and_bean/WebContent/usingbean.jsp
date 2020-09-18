<%@page import="exception_and_bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="cus" class="exception_and_bean.Customer" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:setProperty property="name" name="cus" value="정인호"/>
	<jsp:setProperty property="age" name="cus" value="25"/>
	<jsp:setProperty property="grade" name="cus" value="5"/>
	<jsp:setProperty property="number" name="cus" value="15-73002722"/>
	
	이름 : <jsp:getProperty property="name" name="cus"/> <br>
	나이 : <jsp:getProperty property="age" name="cus"/> <br>
	학년 : <jsp:getProperty property="grade" name="cus"/> <br>
	번호 : <jsp:getProperty property="number" name="cus"/> <br><br>
	
	<%
		Customer cus2 = new Customer();
		cus2.setName("홍길동");
		cus2.setAge(22);
		cus2.setGrade(3);
		cus2.setNumber("15-73002845");
		
		out.println("이름 : " + cus2.getName() + "<br/>");
		out.println("나이 : " + cus2.getAge() + "<br/>");
		out.println("학년 : " + cus2.getGrade() + "<br/>");
		out.println("번호 : " + cus2.getNumber() + "<br/>");
	%>
</body>
</html>