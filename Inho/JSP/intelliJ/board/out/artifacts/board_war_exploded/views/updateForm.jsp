<%@ page import="com.kb.www.vo.ArticleVo" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%ArticleVo bo = (ArticleVo) request.getAttribute("article"); %>

<html>
<head>
    <meta charset="UTF-8">
    <title>수정하기</title>
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
<form action="/updateProc.do" onsubmit="checkData()">
    글 번호 : <input type="hidden" name="number" value="<%=bo.getArticleNumber()%>" readonly> <br/>
    제목 : <input type="text" name="subject" id="subject" value="<%=bo.getArticleTitle()%>" maxlength="100"> <br/><br/>
    내용 : <textarea name="content" id="content" cols="30" rows="10"><%=bo.getArticleContents()%></textarea> <br/>
    <input type="submit" value="수정하기">
    <br/>
    <a href="/list.do">뒤로가기</a>
</form>
</body>
</html>
