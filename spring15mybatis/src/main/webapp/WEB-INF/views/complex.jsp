<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<h1>회원 복합 검색 페이지</h1>

<%-- 검색창 --%>



<%-- 결과s --%>
<h2>결과 수 : ${list.size()}</h2>
<c:forEach var="memberDto" items="${list}">
	${memberDto}
<hr>
</c:forEach>