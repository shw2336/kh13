<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
	테이블 태그
	- <table>이라는 태그로 표를 만들 것임을 명시    
	- <thead>, <tbody>, <tfoot>으로 용도에 맞는 영역을 생성
		- 안쓰면 자동으로 <tbody>가 생김
	- <tr> 태그로 줄 생성
	- <th>, <td> 태그로 칸 생성
		- <th>는 제목을 작성하는 칸으로 굵은 글씨에 가운데 정렬을 제공
		- <td>는 내용을 작성하는 칸으로 일반 글씨에 왼쪽 정렬을 제공
		- 표에 작성되는 모든 내용은 "칸"에만 작성 가능
     --%>
    
<h1>표(테이블) 만들기</h1>

<table width="400">
	<tr>
	<th>첫번째 테스트</th>
	<td>두번째 테스트</td>
	</tr>
</table>

<h1>샘플 테이블 - 멀리뛰기 기록</h1>
<%--border는 테두리라는뜻 숫자는 테두리두께를 의미 --%>
<table border="1">
	<tr>
	<th>학생명</th>
	<th>1차시기</th>
	<th>2차시기</th>
	<th>3차시기</th>
	</tr>
	
	<%--align은 정렬이라는 뜻 가운데 왼쪽 오른쪽 지정 가능 --%>
	<tr align="center">
	<th>철수</th>
	<td>100</td>
	<td>150</td>
	<td>200</td>
	</tr>
	
	<tr align="center">
	<th>영희</th>
	<td>150</td>
	<td>200</td>
	<td>250</td>
	</tr>
</table>

<h1>샘플 테이블 재구성(thead, tbody)</h1>

<table border="1">
	<thead>
	<tr>
	<th>학생명</th>
	<th>1차시기</th>
	<th>2차시기</th>
	<th>3차시기</th>
	</tr>
	</thead>
	
	<tbody align="center">
	<tr>
	<th>철수</th>
	<td>100</td>
	<td>150</td>
	<td>200</td>
	</tr>
	
	<tr>
	<th>영희</th>
	<td>150</td>
	<td>200</td>
	<td>250</td>
	</tr>
	</tbody>
</table>












