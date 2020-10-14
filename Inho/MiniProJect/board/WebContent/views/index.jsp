<%@ page import="com.kb.www.common.LoginManager"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	LoginManager lm = LoginManager.getInstance();
String id = lm.getMemberId(session);
%>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<script type="text/javascript" src="/resource/js/bootstrap.js"></script>
<style>
div {
	display: inline;
	float: none;
}

a {
	vertical-align: middle;
}

</style>
</head>
<body>

	<div class="row">
		<%
			if (id == null) {
		%>

		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-dark text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/list.do?pn=1">게시판이동</a>
		</div>
		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-success text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/join.do">회원가입</a>
		</div>
		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-warning text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/login.do">로그인</a>
		</div>

		<%} else {%>
		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-dark text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/list.do?pn=1">게시판이동</a>
		</div>
		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-success text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/memberUpdate.do">회원정보수정</a><br />
			<a class="btn btn-secondary btn-lg btn-block" href="/leave.do">회원탈퇴</a>
		</div>
		<div style="height: 900px;"
			class="col-4 container p-3 my-3 bg-warning text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/history.do">히스토리</a><br />
			<a class="btn btn-secondary btn-lg btn-block" href="/logout.do">로그아웃</a>
		</div>

		<%}%>
	</div>
</body>
</html>
