<%@page import="com.kb.www.common.LoginManager"%>
<%@ page import="com.kb.www.vo.MemberHistoryVo"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.kb.www.common.Parser"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	ArrayList<MemberHistoryVo> list = (ArrayList<MemberHistoryVo>) request.getAttribute("list");
LoginManager lm = LoginManager.getInstance();
String id = lm.getMemberId(session);
%>
<html>

<head>
<meta charset="UTF-8">
<title>회원히스토리</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<script type="text/javascript" src="/resource/js/bootstrap.js"></script>


<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">

<style type="text/css">
body {
	color: black;
	font-weight: bold;
}

th, tr, thead {
	color: black;
	font-weight: bold;
}

a {
	color: black;
	font-size: 24px;
}

.main_content {
	opacity: 0.7;
	position: relative;
	background-image: url('images/orange_back1.jpg');
	width: 1920px;
	height: 100vh;
	background-repeat: no-repeat;
	background-size: cover;
	border-radius: 10px 10px 10px 10px;
	z-index: 1;
}
</style>
</head>
<body>
	<div class="main_content">
		<div class="row" style="padding: 10px; z-index: 2;">
			<div class="col-md-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">인호네 게시판</h3>
						<i class="fa fa-bell" aria-hidden="true"></i> <br /> <br /> <br />
					</div>
					<!-- 사이드바 메뉴목록1 -->
					<div class="list-group">
						<div class="input-group"></div>
						<button class="btn btn-dark" onclick="location.href='/'">메인으로</button>

					</div>
				</div>
			</div>

			<div class="container col-md-9">
				<table class="table table-hover">
					<thead>
						<tr>
							<th scope="col" class="text-center">아이디</th>
							<th scope="col" class="text-center">구분</th>
							<th scope="col" class="text-center">발생 일시</th>
						</tr>
					</thead>
					<tbody>
						<%
							for (int i = 0; i < list.size(); i++) {
						%>
						<tr onclick="goDetail(<%=list.size()%>)">
							<td style="width: 10%" scope="col" class="text-center"><%=id%>
							</td>
							<td style="width: 40%" scope="col" class="text-center"><%=Parser.parseMemberEventType(list.get(i).getEvt_type())%>
							</td>
							<td style="width: 50%" scope="col" class="text-center"><%=list.get(i).getDttm()%>
							</td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
