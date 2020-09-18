<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
body {
	font-size: 40px;
	font-weight : bold;
	color: red;
}

a {
	font-size: 20px;
	color: blue;
}
</style>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		String id = cookies[i].getValue();
		if (id.equals("aaa")) {
			out.println(id + "님 안녕하세요. </br>");
		}
	}
	%>
	<br />
	<a href="logout.jsp">로그아웃</a>
</body>
</html>