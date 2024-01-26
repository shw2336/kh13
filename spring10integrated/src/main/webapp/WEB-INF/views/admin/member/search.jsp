<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 검색</h1>

<%-- 검색창 --%>

<form action="search" method="get">
	<select name="column">
		<option value="member_id" ${param.column == 'member_id' ? 'selected' : ''}>아이디</option>
		<option value="member_nick" ${param.column == 'member_nick' ? 'selected' : ''}>닉네임</option>
		<option value="member_contact" ${param.column == 'member_contact' ? 'selected' : ''}>연락처</option>
		<option value="member_email" ${param.column == 'member_email' ? 'selected' : ''}>이메일</option>
		<option value="member_birth" ${param.column == 'member_birth' ? 'selected' : ''}>생년월일</option>
	</select>
	<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>