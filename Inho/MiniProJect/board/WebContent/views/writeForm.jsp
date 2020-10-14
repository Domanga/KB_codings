<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>

<%
	String nowPage = request.getParameter("pn");
%>
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
		// var content = $('#content').val();
		// if (!content) {
		//     alert("내용을 입력하세요.");
		//     $('#content').focus();
		//     return false;
		// }
	}
</script>
<style>
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
					<i class="fa fa-bell" aria-hidden="true"></i> <br /> <br /> <br />
				</div>
				<!-- 사이드바 메뉴목록1 -->
				<div class="list-group">
					<div class="input-group"></div>
					<button class="btn btn-dark" onclick="location.href='/list.do?pn=1'">뒤로가기</button>
					<button class="btn btn-dark" onclick="location.href='/'">메인으로</button>
				</div>
			</div>
		</div>

		<div class="container col-md-9">
			<form action="/register.do" method="post"
				onsubmit="return checkData()">
				<div class="form-group">
					<label for="">제목</label> <input type="text" class="form-control"
						name="subject" id="subject" maxlength="100">
				</div>
				<div class="form-group">
					<label for="">내용</label>
					<textarea name="content" class="form-control" id="content"
						cols="30" rows="10"></textarea>
					<input type="submit" class="btn btn-dark" value="등록">
				</div>
			</form>
		</div>
	</div>
</body>
</html>
