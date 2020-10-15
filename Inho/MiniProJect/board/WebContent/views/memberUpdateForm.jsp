<%@ page import="com.kb.www.vo.ArticleVo"%>
<%@ page import="com.kb.www.vo.MemberVo"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	MemberVo vo = (MemberVo) request.getAttribute("vo");
%>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<script src="https://code.jquery.com/jquery-3.5.1.slim.js"
	integrity="sha256-DrT5NfxfbHvMHux31Lkhxg42LY6of8TaYyK50jnxRnM="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<link rel="stylesheet" href="temp/colorlib-regform-7/css/style.css">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<script>
	function validateCheck() {
		var pwd = $('#pwd').val();
		var pwd_confirm = $('#pwd_confirm').val();

		if (!pwd) {
			alert("비밀번호를 입력해 주세요.");
			$('#pwd').focus();
			return false;
		}

		if (!pwd_confirm) {
			alert("비밀번호확인을 입력해 주세요.");
			$('#pwd_confirm').focus();
			return false;
		}

		if (pwd != pwd_confirm) {
			alert("비밀번호가 다릅니다.");
			$('#pwd').val("");
			$('#pwd_confirm').val("");
			$('#pwd').focus();
			return false;
		}

		var regExpPwd = new RegExp("^.{4,30}$", "g");
		if (regExpPwd.exec(pwd) == null) {
			alert("잘못된 비밀번호 형식입니다.");
			$('#pwd').val("");
			$('#pwd_confirm').val("");
			$('#pwd').focus();
			return false;
		}

	}

	function GoBack() {
		location.href = "/";
	}
</script>
<style type="text/css">
body {
	margin: 0;
	opacity: 0.9;
	position: relative;
	background-image: url('images/green_back.jpg') !important;
	width: 1920px;
	height: 100vh;
	background-repeat: no-repeat;
	background-size: cover;
	border-radius: 10px 10px 10px 10px;
	z-index: 1;
	opacity: 0.8;
	opacity: 0.9;
}
</style>
</head>
<body>
	<div class="main">
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Update Info</h2>
						<form action="/memberUpdateProc.do"
							onsubmit="return validateCheck()" method="post"
							class="register-form" onsubmit="return validateCheck()"
							id="register-form">
							<div class="form-group">
								<label for="name"><i class="fa fa-id-card"
									aria-hidden="true"></i></label> <input type="text" name="id" id="id"
									placeholder="<%=vo.getId()%>" disabled>
							</div>
							<div class="form-group">
								<label for="pass"><i class="fa fa-key"
									aria-hidden="true"></i></label> <input type="password" name="pwd"
									id="pwd" placeholder="New Password">
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="fa fa-key"
									aria-hidden="true"></i></label> <input type="password"
									name="pwd_confirm" id="pwd_confirm"
									placeholder="Repeat your password">
							</div>
							<div class="form-group">
								<label for="email"><i class="fa fa-envelope"
									aria-hidden="true"></i></label> <input type="email" name="email"
									id="email" placeholder="<%=vo.getEmail()%>">
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Update"> <input
									type="button" class="form-submit" value="Back"
									onclick="GoBack()">
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
					</div>
				</div>
			</div>
		</section>

	</div>

	<script type="text/javascript" async
		src="https://www.google-analytics.com/analytics.js"></script>
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>

	<script async
		src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-23581568-13');
	</script>
</body>
</html>
