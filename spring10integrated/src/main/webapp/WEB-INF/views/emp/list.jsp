<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <h1>사원 목록</h1>
    <form action="list" method="get">
    	<select name="column">
    		<option value="emp_name">이름</option>
    		<option value="emp_dept">부서</option>
    		<option value="emp_date">입사일</option>
    		<option value="emp_sal">급여</option>
	    </select>
    	<input type="search" name="keyword" value="${param.keyword}">
    	<button>검색</button>
    </form>
    
    <c:forEach var="dto" items="${list}">
	<h2>
	번호 = ${dto.empNo}
	이름 = ${dto.empName}
	부서 = ${dto.empDept}
	입사일 = ${dto.empDate}
	급여 = ${dto.empSal}
	</h2>    
    </c:forEach>