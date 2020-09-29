<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인</title
    <script src="http://code.jquery.com/jquery-3.5.1.js"
            integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
            crossorigin="anonymous">
    </script>
    <script>
        function validateCheck() {
            var id = $('#id').val();
            var pw = $('#pw').val();

            if(!id) {
                alert("아이디를 입력해주세요.");
                $('#id').focus;
                return false;
            }

            if(!pw) {
                alert("비밀번호를 입력해주세요.");
                $('#pw').focus;
                return false;
            }
        }
    </script>
</head>
<body>
<form action="/loginProc.do" method="post" onsubmit="return validateCheck()">
    아이디 : <input type="text" name="id"> <br/>
    비밀번호 : <input type="password" name="pw" > <br/>
    <input type="submit" value="로그인">
    <button type="button" onclick="location.href='/'">취소</button>
</form>
</body>
</html>
