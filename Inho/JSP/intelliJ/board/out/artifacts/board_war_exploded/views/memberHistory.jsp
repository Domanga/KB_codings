<%@page import="java.util.ArrayList" %>
<%@page import="com.kb.www.vo.ArticleVo" %>
<%@ page import="com.kb.www.vo.MemberHistoryVo" %>
<%@ page import="com.kb.www.common.Parser" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%ArrayList<MemberHistoryVo> list = (ArrayList<MemberHistoryVo>) request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그</title>
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
        location.href = "detail.do?num=" + articleNum;
    }

    function insertInfo() {
        location.href = "/add.do";
    }
</script>
<body>
<table>
    <tr>
        <td>구분</td>
        <td>발생일시</td>
    </tr>
    <% if (list.size() > 0) {%>
    <% for (int i = 0; i < list.size(); i++) {%>
    <tr>
        <td><%=Parser.parseMemberEventType(list.get(i).getExt_type()) %>
        </td>
        <td><%=list.get(i).getDttm() %>
        </td>

    </tr>
    <% } %>
    <% } else { %>
    <tr>
        <td colspan="2">기록이 없습니다.</td>
    </tr>
</table>
<% } %>
<br/>
<button onclick="location.href='/index.jsp'">뒤로가기</button>
</body>
</html>