<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
    <script src="http://code.jquery.com/jquery-3.5.1.js"
            integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
            crossorigin="anonymous">
    </script>

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
</head>
<body>
<form action="/addProc.do" onsubmit="checkData()">
    제목 : <input type="text" name="subject" id="subject" maxlength="100"> <br/><br/>
    내용 : <textarea name="content" id="content" cols="30" rows="10"></textarea> <br/>
    <input type="submit" value="입력">
    <br/>
    <a href="/list.do">뒤로가기</a>
</form>
</body>
</html>
