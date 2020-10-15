<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" type="image/png" href="images/icons/favicon.ico">

<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">

<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">

<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/daterangepicker/daterangepicker.css">

<link rel="stylesheet" type="text/css" href="temp/Login_v2/css/util.css">
<link rel="stylesheet" type="text/css" href="temp/Login_v2/css/main.css">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">

<script>
	function validateCheck() {
		var id = $('#id').val();
		var pwd = $('#pwd').val();

		if (!id) {
			alert("아이디를 입력해 주세요.");
			$('#id').focus();
			return false;
		}

		if (!pwd) {
			alert("비밀번호를 입력해 주세요.");
			$('#pwd').focus();
			return false;
		}
	}

	function GoBack() {
		location.href = "/";
	}
</script>
<style>
body {
	margin: 0;
	opacity: 0.8;
	position: relative;
	background-image: url('images/orange_back.jpg') !important;
	width: 1920px;
	height: 100vh;
	background-repeat: no-repeat;
	background-size: cover;
	border-radius: 10px 10px 10px 10px;
	z-index: 1;
	opacity: 0.8;
}
</style>
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form" action="/loginProc.do"
					method="post" onsubmit="return validateCheck()">
					<span class="login100-form-title p-b-26"> Welcome </span> <span
						class="login100-form-title p-b-48"> <i class="fa fa-bell"
						aria-hidden="true"></i>
					</span>
					<div class="wrap-input100 validate-input" data-validate="Enter id">
						<input class="input100" type="text" name="id"> <span
							class="focus-input100" data-placeholder="Id"></span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Enter password">
						<span class="btn-show-pass"> <i class="fa fa-eye"
							aria-hidden="true"></i>
						</span> <input class="input100" type="password" name="pwd"> <span
							class="focus-input100" data-placeholder="Password"></span>
					</div>
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<input class="login100-form-btn" type="submit" value="Login">
						</div>
					</div>
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<input class="login100-form-btn" type="button" onClick="GoBack()"
								value="Back" />
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1"> 아직 회원이 아니신가요? </span> <a class="txt2"
							href="/join.do"> 회원가입 </a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="dropDownSelect1"></div>

	<script type="text/javascript" async
		src="https://www.google-analytics.com/analytics.js"></script>
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>

	<script src="vendor/animsition/js/animsition.min.js"></script>

	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<script src="vendor/select2/select2.min.js"></script>

	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>

	<script src="vendor/countdowntime/countdowntime.js"></script>

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
	<script defer src="https://static.cloudflareinsights.com/beacon.min.js"
		data-cf-beacon="{&quot;rayId&quot;:&quot;5e1db13a5e17e9d8&quot;,&quot;version&quot;:&quot;2020.9.1&quot;,&quot;si&quot;:10}"></script>


</body>
</html>