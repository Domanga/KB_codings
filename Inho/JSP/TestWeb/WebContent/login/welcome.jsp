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
			out.println(id + "�� �ȳ��ϼ���. </br>");
		}
	}
	%>
	<br />
	<a href="logout.jsp">�α׾ƿ�</a>
</body>
</html>