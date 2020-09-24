<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.kb.www.vo.ArticleVo"%>    

    <%ArticleVo bo = (ArticleVo) request.getAttribute("article"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		margin : auto;
	}
	table, tr, td {
		border: 1px solid black;
		text-align: center;
	}

</style>
</head>
<body>
<table>
	<tr>
		<td>번호</td>
		<td>제목</td> 
		<td>내용</td>
		<td>조회수</td>
		<td>작성일시</td>
	</tr>
	
	<tr>
		<td><%=bo.getArticleNumber() %></td>
  		<td><%=bo.getArticleTitle() %></td>
		<td><%=bo.getArticleContents() %></td>
		<td><%=bo.getHit() %></td>
		<td><%=bo.getWriteDatetime() %></td>
	</tr>

</table>
</body>
</html>