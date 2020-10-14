<%@ page import="java.util.ArrayList"%>
<%@ page import="com.kb.www.vo.ArticleVo"%>
<%@ page import="com.kb.www.common.Pagenation"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	ArrayList<ArticleVo> list = (ArrayList<ArticleVo>) request.getAttribute("list");
Pagenation pagenation = (Pagenation) request.getAttribute("pagenation");
String nowPage = request.getParameter("pn");
%>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<script type="text/javascript" src="/resource/js/bootstrap.js"></script>


<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">


<script type="text/javascript">
        function goDetail(num) {
            location.href =
                "/detail.do?pn=" + <%=nowPage%> +"&num=" + num;
        }

        function searchArticle() {
            var filter = $('#filter option:selected').val();
            var keyword = $('#keyword').val();
            location.href =
				"/list.do?pn=1&filter=" + filter + "&keyword=" + keyword;
                
                alert(filter + keyword);
        }
        
        function showItworks() {
        	
        }
    </script>
<style type="text/css">
#inline {
	display: inline;
	width: 300px;
}

body {
	padding: 20px;
}
</style>
</head>
<body>
	<!-- select name="filter" id="filter">
		<option value="all" selected>전체</option>
		<option value="subject">제목</option>
		<option value="content">내용</option>
	</select>
	<input type="text" name="keyword" id="keyword">
	<button onclick="searchArticle()">검색</button -->
	<div class="row">
		<div class="col-md-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">인호네 게시판</h3>
					<i class="fa fa-bell" aria-hidden="true"></i> <br /> <br /> <br />
				</div>
				<!-- 사이드바 메뉴목록1 -->
				<div class="list-group">

					<select name="filter" id="filter" class="form-control">
						<option value="all" selected>전체</option>
						<option value="subject">제목</option>
						<option value="contents">내용</option>
					</select>

					<div class="input-group">
						<input type="text" class="form-control" name="keyword"
							id="keyword"> <span class="input-group-btn">
							<button type="button" class="btn btn-dark"
								onclick="searchArticle()">검색</button>
						</span>
					</div>

					<button class="btn btn-dark" onclick="location.href='/write.do'">글쓰기</button>
					<button class="btn btn-dark" onclick="location.href='/'">메인으로</button>

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
					<%
						for (int i = 0; i < list.size(); i++) {
					%>
					<tr onclick="goDetail(<%=list.get(i).getNum()%>)">
						<td style="width: 10%" scope="col" class="text-center"><%=list.get(i).getNum()%>
						</td>
						<td style="width: 30%" scope="col" class="text-center"><%=list.get(i).getSubject()%>
						</td>
						<td style="width: 10%" scope="col" class="text-center"><%=list.get(i).getHit()%>
						</td>
						<td style="width: 20%" scope="col" class="text-center"><%=list.get(i).getId()%></td>
						<td style="width: 40%" scope="col" class="text-center"><%=list.get(i).getWdate()%>
						</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<div class="text-center">
				<span> <a
					href="/list.do?pn=<%=pagenation.getStartPage() - 1%>"><</a>
				</span>
				<%
					for (int i = pagenation.getStartPage(); i <= pagenation.getEndPage(); i++) {
				%>
				<span> <a href="/list.do?pn=<%=i%>"> <%=i%>
				</a>
				</span>
				<%
					}
				%>
				<span> <a href="/list.do?pn=<%=pagenation.getEndPage() + 1%>">></a>
				</span>
			</div>
		</div>
	</div>
</body>
</html>












