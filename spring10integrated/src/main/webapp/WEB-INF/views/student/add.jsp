<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>학생 정보 등록</h1>

<form action="add" method="post">

	이름 <input type="text" name="name" required> <br><br>
	국어점수 <input type="number" name="koreanScore" required> <br><br>
	수학점수 <input type="number" name="mathScore" required> <br><br>
	영어점수 <input type="number" name="englishScore" required> <br><br>
	<button>학생 정보 등록</button>
	<br><br>
		<a href="list">목록 보기</a>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>