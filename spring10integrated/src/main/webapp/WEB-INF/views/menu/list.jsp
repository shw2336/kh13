<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <h1>메뉴 목록</h1>
    <form action="list" method="get">
    	<select name="column">
			<option value="menu_name_kor">메뉴이름(한글)</option>    	
			<option value="menu_name_eng">메뉴이름(영어)</option>    	
			<option value="menu_type">분류</option>    	
			<option value="menu_price">가격</option>    	
    	</select>
    	<input type="search" name="keyword" value="${param.keyword}">
    	<button>검색</button>
    </form>
    
    <c:forEach var="dto" items="${list}">
    <h2>
    번호 = ${dto.menuNo}
    이름(한글) = ${dto.menuNameKor}
    이름(영어) = ${dto.menuNameEng}
    분류 = ${dto.menuType}
    가격 = ${dto.menuPrice}
    </h2>
    </c:forEach>