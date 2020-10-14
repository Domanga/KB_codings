<%@ page import="com.kb.www.vo.ArticleVo"%>
<%@ page import="com.kb.www.common.LoginManager"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	ArticleVo vo = (ArticleVo) request.getAttribute("vo");
LoginManager lm = LoginManager.getInstance();
String id = lm.getMemberId(session);
String nowPage = request.getParameter("pn");
%>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>

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
	padding: 20px;
}
</style>

</head>
<body>

	<div class="row">
		<div class="col-md-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">인호네 게시판</h3>
					<br /> <br /> <br />
				</div>
				<!-- 사이드바 메뉴목록1 -->
				<div class="list-group">
					<div class="input-group"></div>

					<button class="btn btn-dark" onclick="location.href='/list.do?pn=<%=nowPage%>'">목록으로</button>
				</div>
			</div>
		</div>

		<div class="container col-md-9">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col" class="text-center">글 번호</th>
						<th scope="col" class="text-center">글 제목</th>
						<th scope="col" class="text-center">조회수</th>
						<th scope="col" class="text-center">글쓴이</th>
						<th scope="col" class="text-center">작성일자</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td style="width: 10%" scope="col" class="text-center"><%=vo.getNum()%>
						</td>
						<td style="width: 30%" scope="col" class="text-center"><%=vo.getSubject()%>
						</td>
						<td style="width: 10%" scope="col" class="text-center"><%=vo.getHit()%>
						</td>
						<td style="width: 20%" scope="col" class="text-center"><%=vo.getId()%></td>
						<td style="width: 40%" scope="col" class="text-center"><%=vo.getWdate()%>
						</td>
					</tr>
				</tbody>
			</table>
		</div>

		
		<%
			if (id != null && id.equals(vo.getId())) {
		%>
		<button
			onclick="location.href='/update.do?pn=<%=nowPage%>&num=<%=vo.getNum()%>'">수정</button>
		<button
			onclick="location.href='/delete.do?pn=<%=nowPage%>&num=<%=vo.getNum()%>'">삭제</button>
		<%
			}
		%>
	
</body>
</html>
