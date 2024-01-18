<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>사원 정보 수정</h1>
    
    <form action="edit" method="post">
    	번호 <input type="text" name="empNo" required> <br><br>
    	이름 <input type="text" name="empName" required> <br><br>
    	부서 <input type="text" name="empDept" required> <br><br>
    	입사일 <input type="date" name="empDate" required> <br><br>
    	급여 <input type="number" name="empSal" required> <br><br>
    	<button>정보 수정</button>
    </form>