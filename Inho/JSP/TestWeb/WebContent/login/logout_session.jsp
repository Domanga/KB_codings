<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	Enumeration enumeration = session.getAttributeNames();
	
	System.out.println("���� ��");
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		
		System.out.println("sName : " + sName + "<br/>");
		System.out.println("sValue : " + sValue + "<br/>");
	}

	enumeration = session.getAttributeNames();
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		
		if(sValue.equals("aaa") || sValue.equals("1234")) {
			session.removeAttribute(sName);
		}
	}
	
	enumeration = session.getAttributeNames();
	
	System.out.println("���� ��");
	while (enumeration.hasMoreElements()) {
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		
		System.out.println("sName : " + sName + "<br/>");
		System.out.println("sValue : " + sValue + "<br/>");
	}
	response.sendRedirect("sessiontest.jsp");
	
%>
</body>
</html>