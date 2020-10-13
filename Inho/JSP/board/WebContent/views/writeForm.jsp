<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
    <script
            src="https://code.jquery.com/jquery-3.5.1.slim.js"
            integrity="sha256-DrT5NfxfbHvMHux31Lkhxg42LY6of8TaYyK50jnxRnM="
            crossorigin="anonymous"></script>
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
</head>
<body>
<form id="editorForm" action="/register.do" method="post" onsubmit="return checkData()">
    제목 <input type="text" name="subject" id="subject" maxlength="100">
    내용
    <li>
        <jsp:include page="/editor/editorSkin.jsp" flush="false"/>
    </li>
    <input type="submit" value="등록">
    <button type="button" class="btn btn-defalut" onclick="location.href='/'">뒤로가기</button>
</form>
</body>
</html>
