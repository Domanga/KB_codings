<%@page import="java.util.ArrayList" %>
<%@page import="com.kb.www.vo.ArticleVo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%ArrayList<ArticleVo> list = (ArrayList<ArticleVo>) request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <style>
        table {
            margin: auto;
        }

        table, tr, td {
            border: 1px solid black;
            text-align: center;
        }

        td {
            padding: 5px;
            height: 30px;
        }

    </style>
</head>
<script type="text/javascript">
    function showDetail(articleNum) {
        location.href = "/detail.do?num=" + articleNum;
    }

    function insertInfo() {
        location.href = "/add.do";
    }
</script>
<body>
<table>
    <tr>
        <td>번호</td>
        <td>작성자</td>
        <td>제목</td>
        <td>내용</td>
        <td>조회수</td>
        <td>작성일시</td>
        <td>수정날짜</td>
    </tr>
    <% if (list.size() > 0) {%>
    <% for (int i = 0; i < list.size(); i++) {%>
    <tr onclick="showDetail(<%=list.get(i).getArticleNumber()%>)">
        <td><%=list.get(i).getArticleNumber() %>
        </td>
        <td><%=list.get(i).getId() %>
        </td>

        <td><%=list.get(i).getArticleTitle() %>
        </td>
        <td><%=list.get(i).getArticleContents() %>
        </td>
        <td><%=list.get(i).getHit() %>
        </td>
        <td><%=list.get(i).getWriteDatetime() %>
        </td>
        <td><%=list.get(i).getModifyDatetime() %>
        </td>
    </tr>
    <% } %>
    <% } else { %>
    <tr>
        <td colspan="7">게시글이 없습니다.</td>
    </tr>
</table>
<% } %>
<br/>
<button style="margin: auto" onclick="insertInfo()">새로작성하기</button> <br/>
<button onclick="location.href='/index.jsp'">뒤로가기</button>
</body>
</html>