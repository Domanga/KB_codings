<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <%! String id, pw; %>
 <%
 	id = request.getParameter("id");
 	pw = request.getParameter("pw");
 	
 	if(id.equals("aaa") && pw.equals("1234")) {
 		//Cookie cookie = new Cookie("id", id);
 		//cookie.setMaxAge(60);
 		//response.addCookie(cookie);
 		
 		session.setAttribute("id", id);
 		session.setAttribute("pw", pw);
 		response.sendRedirect("welcome_session.jsp");
 	}
 	else  {
 		response.sendRedirect("login_session.html");
 	}
 %>
</body>
</html>