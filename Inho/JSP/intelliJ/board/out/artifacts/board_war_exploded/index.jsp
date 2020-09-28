<%@ page import="com.kb.www.common.LoginManager" %><%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2020-09-24
  Time: 오전 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% LoginManager lm = LoginManager.getInstance();
    String id = lm.getMemberId(session);
%>
        <html>
<head>
    <title>게시판</title>
</head>
<body>
<a href="/list.do">목록보기</a>
<%if(id == null) { %>
<a href="/join.do">회원가입</a>
<a href="/login.do">로그인</a>
<% } else { %>
<a href="/logout.do">로그아웃</a>
<% } %>
</body>
</html>
