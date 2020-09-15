<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	int i = 10;
	String str = "ABCD";
%>

<%!
	public int sum(int a, int b) {
	return a+b;
}

%>
<%
for(int i = 1; i <=9; i++)
{
	for(int j = 2; j<=9; j++)
	{
		out.write(j + " * " + i + "=" + (i*j) + " ");
		
	}
	out.write("<br/>");
}

out.println("i = " + i + "<br/>");
out.println("str = " + str + "<br/>");
out.println("str = " + sum(1,5) + "<br/>");

%>


</body>
</html>