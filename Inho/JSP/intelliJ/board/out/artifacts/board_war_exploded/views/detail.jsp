<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="com.kb.www.vo.ArticleVo" %>

<%ArticleVo bo = (ArticleVo) request.getAttribute("article"); %>
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
    <script type="text/javascript">
        function update() {
            location.href = "modify.do";
        }

        function deleteArticle() {
            location.href = "/delete.do";
        }
    </script>
</head>
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

    <tr>
        <td><%=bo.getArticleNumber() %>
        </td>
        <td><%=bo.getId() %>
        </td>
        <td><%=bo.getArticleTitle() %>
        </td>
        <td><%=bo.getArticleContents() %>
        </td>
        <td><%=bo.getHit() %>
        </td>
        <td><%=bo.getWriteDatetime() %>
        </td>
        <td><%=bo.getModifyDatetime() %></td>
    </tr>
</table>
<button onclick="location.href='/update.do?number=<%=bo.getArticleNumber()%>'">수정하기</button>
<button onclick="location.href='/delete.do?number=<%=bo.getArticleNumber()%>'">삭제하기</button>
<button onclick="location.href='/list.do'">뒤로가기</button>
</body>
</html>