<%@ page import="com.kb.www.vo.ArticleVo"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	ArticleVo vo = (ArticleVo) request.getAttribute("vo");
String nowPage = request.getParameter("pn");
%>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script src="https://code.jquery.com/jquery-3.5.1.slim.js"
	integrity="sha256-DrT5NfxfbHvMHux31Lkhxg42LY6of8TaYyK50jnxRnM="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<script type="text/javascript" src="/resource/js/bootstrap.js"></script>

<script>
	function checkData() {
		var subject = $('#subject').val();
		if (!subject) {
			alert("제목을 입력하세요.");
			$('#subject').focus();
			return false;
		}
		var content = $('#content').val();
		if (!content) {
			alert("내용을 입력하세요.");
			$('#content').focus();
			return false;
		}
	}
</script>
<style>
body {
	color: white;
	font-weight: bold;s
}

th, tr, thead {
	color: white;
	font-weight: bold;
}

a {
	color: white;
	font-size: 24px;
}

.main_content {
	opacity: 0.8;
	position: relative;
	background-image: url('images/grey_back.jpg');
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
		<div class="row" style="z-index: 2; padding: 10px;">
			<div class="col-md-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">인호네 게시판</h3>
						<br /> <br /> <br />
					</div>
					<!-- 사이드바 메뉴목록1 -->
					<div class="list-group">
						<div class="input-group"></div>

						<button class="btn btn-dark"
							onclick="location.href='/list.do?pn=<%=nowPage%>'">목록으로</button>

					</div>
				</div>
			</div>

			<div class="container col-md-9">
				<form action="/updateProc.do?pn=<%=nowPage%>&num=<%=vo.getNum()%>"
					method="post" onsubmit="return checkData()">
					<div class="form-group">
						<label for="">제목</label> <input type="text" class="form-control"
							name="subject" id="subject" maxlength="100"
							value="<%=vo.getSubject()%>">
					</div>
					<div class="form-group">
						<label for="">내용</label>
						<textarea name="content" class="form-control" id="content"
							cols="30" rows="10"><%=vo.getContent()%></textarea>
						<input type="submit" class="btn btn-dark" value="수정">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
