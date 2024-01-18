<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>사원 등록</h1>

<form action="insert" method="post">
	번호: <input name="empNo" type="text"> <br><br>
	이름: <input name="empName" type="text"> <br><br>
	부서: <input name="empDept" type="text"> <br><br>
	입사일: <input name="empDate" type="date"> <br><br>
	급여: <input name="empSal" type="text"> <br><br>
	<button>등록</button>
</form>