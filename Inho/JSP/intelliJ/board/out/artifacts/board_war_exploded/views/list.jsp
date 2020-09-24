<%@page import="java.util.ArrayList" %>
<%@page import="com.kb.www.vo.ArticleVo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%ArrayList<ArticleVo> list = (ArrayList<ArticleVo>) request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
        table {
            margin: auto;
        }

        table, tr, td {
            border: 1px solid black;
            text-align: center;
        }

    </style>
</head>
<script type="text/javascript">
    function showDetail(articleNum) {
        location.href = "detail?num=" + articleNum;
    }
</script>
<body>
<table>
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>내용</td>
        <td>조회수</td>
        <td>작성일시</td>
    </tr>
    <% if (list.size() > 0) {%>
    <% for (int i = 0; i < list.size(); i++) {%>
    <tr onclick="showDetail(<%=list.get(i).getArticleNumber()%>)">
        <td><%=list.get(i).getArticleNumber() %>
        </td>
        <td><%=list.get(i).getArticleTitle() %>
        </td>
        <td><%=list.get(i).getArticleContents() %>
        </td>
        <td><%=list.get(i).getHit() %>
        </td>
        <td><%=list.get(i).getWriteDatetime() %>
        </td>
    </tr>
    <% } %>
    <% } else { %>
    <tr>
        <td colspan="5">게시글이 없습니다.</td>
    </tr>
    <% } %>
    <form action="add" method="post">
    글 제목 : <input type="text" name="subject"/> <br/>
    글 내용 : <input type="text" name="content"/> <br/>

    <input type="submit" value="작성하기">
</form>
</table>
</body>
</html>