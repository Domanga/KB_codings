<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title
    <script src="http://code.jquery.com/jquery-3.5.1.js"
            integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
            crossorigin="anonymous">
    </script>
    <script>
        function validateCheck() {
            var id = $('#id').val();
            var pw = $('#pw').val();
            var pw_confirm = $('#pw_confirm').val();

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

            if(!pw_confirm) {
                alert("비밀번호를 확인해주세요.");
                $('#pw_confirm').focus;
                return false;
            }

            if(pw != pw_confirm) {
                alert("비밀번호가 일치하지 않습니다..");
                $('#pw_confirm').val("");
                $('#pw_confirm').focus;
                return false;
            }

            var regExpId = new RegExp("^[a-z0-9]{4,20}$", "g");  // a~z까지 0~9까지, 4~20허용 정규식
            if(regExpId.exec(id) == null ) {
                alert("잘못된 아이디 형식입니다.");
                $('#id').val("");
                $('#id').focus();
                return false;
            }

            var regExpPw = new RegExp("^.{4,30}$", "g");  // ^. -> 모든 형식 허용
            if(regExpPw.exec(pw) == null ) {
                alert("잘못된 비밀번호 형식입니다.");
                $('#pw').val("");
                $('#pw').focus();
                return false;
            }
        }
    </script>
</head>
<body>
<form action="/joinProc.do" method="post" onsubmit="return validateCheck()">
    아이디 : <input type="text" name="id" minlength="4" maxlength="20"> <br/>
    비밀번호 : <input type="password" name="pw" minlength="4" maxlength="30"> <br/>
    비밀번호확인 : <input type="password" name="pw_confirm" minlength="4" maxlength="30"> <br/>
    <input type="submit" value="가입">
    <button type="button" onclick="location.href='/'">취소</button>
</form>
</body>
</html>
