<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1> 비밀번호 변경 </h1>

<c:if test="${param.error != null}">
	<h3 style="color: red">기존 비밀번호가 일치하지 않습니다</h3>
</c:if>

<form action="password" method="post">
	기존 비밀번호 <input type="password" name="memberPw" required> <br><br>
	신규 비밀번호 <input type="password" name="memberPw" required> <br><br>
	<button>비밀번호 변경</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>