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
<link href="resource/js/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/bootstrap.js"></script>
<style>
div {
	display: inline;
	float: none;
}

body {
	margin: 0;
}

a {
	vertical-align: middle;
}
</style>
</head>
<body>

	<div class="row" style="width: 1900px; margin-left: 0px;">
		<%
			if (id == null) {
		%>

		<div
			style="margin-top: 0px; height: 100vh; opacity: 0.9; background-image: url('images/grey_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-dark text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/list.do?pn=1"
				style="margin-top: 444px">게시판이동</a>
		</div>
		<div
			style="height: 100vh; opacity: 0.9; background-image: url('images/green_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-success text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/join.do"
				style="margin-top: 444px">회원가입</a>
		</div>
		<div
			style="height: 100vh; opacity: 0.9; background-image: url('images/orange_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-warning text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/login.do"
				style="margin-top: 444px">로그인</a>
		</div>

		<%} else {%>
		<div
			style="height: 100vh; opacity: 0.9; background-image: url('images/grey_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-dark text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/list.do?pn=1"
				style="margin-top: 444px">게시판이동</a>
		</div>
		<div
			style="height: 100vh; opacity: 0.9; background-image: url('images/green_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-success text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/memberUpdate.do"
				style="margin-top: 410px">회원정보수정</a><br /> <a
				class="btn btn-secondary btn-lg btn-block" href="/leave.do">회원탈퇴</a>
		</div>
		<div
			style="height: 100vh; opacity: 0.9; background-image: url('images/orange_back.jpg'); background-size: cover; background-repeat: no-repeat; border-radius: 10px 10px 10px 10px;"
			class="col-4 container p-3 my-3 bg-warning text-white">
			<a class="btn btn-secondary btn-lg btn-block" href="/history.do"
				style="margin-top: 410px">히스토리</a><br /> <a
				class="btn btn-secondary btn-lg btn-block" href="/logout.do">로그아웃</a>
		</div>

		<%}%>
	</div>
</body>
</html>
