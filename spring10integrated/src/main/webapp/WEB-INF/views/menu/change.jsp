<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>메뉴 정보 변경</h1>
    
    <form action="edit" method="post">
    	<input type="hidden" name="menuNo" required value= "${dto.menuNo}">
    	메뉴(한글) <input type="text" name="menuNameKor" required value= "${dto.menuNameKor}"> <br><br>
    	메뉴(영어) <input type="text" name="menuNameEng" required value="${dto.menuNameEng}"> <br><br>
    	타입 <input type="text" name="menuType" required value="${dto.menuType}"> <br><br>
    	가격 <input type="number" name="menuPrice" required value="${dto.menuPrice}"> <br><br>
    	<button>메뉴정보 수정</button>
    </form>