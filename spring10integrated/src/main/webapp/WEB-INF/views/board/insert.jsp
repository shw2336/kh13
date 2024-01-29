<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시판 등록</h1>

<form action="insert" method="post">
	제목 <input type="text" name="boardTitle" required> <br><br>
	내용 <input type="text" name="boardContact" required> <br><br>
	작성자 <input type="text" name="boardWriter" value="${sessionScope.loginId}" readonly> <br><br>

	<button>게시글 등록</button>
	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>