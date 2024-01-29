<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시글 목록,검색</h1>

<h2><a href="insert">게시글 등록</a></h2>

<%-- 목록 출력 --%>
<table border="1">
	<thead>
		<tr>
			<th>게시글번호</th>
			<th>게시글제목</th>
			<th>게시글내용</th>
			<th>게시글작성자</th>
			<th>게시한 시간</th>
			<th>수정한 시간</th>
			<th>조회 수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo}</td>
			<td>${boardDto.boardTitle}</td>
			<td>${boardDto.boardContent}</td>
			<td>${boardDto.boardWriter}</td>
			<td>${boardDto.boardWtime}</td>
			<td>${boardDto.boardEtime}</td>
			<td>${boardDto.boardReadcount}</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>