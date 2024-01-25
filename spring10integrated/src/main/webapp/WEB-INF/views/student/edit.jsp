<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>메뉴 정보 수정</h1>

<form action="edit" method="post">
	<input type="hidden" name="menuNo" value="${dto.menuNo}">
	
	메뉴명(한글) <input type="text" name="menuNameKor" value="${dto.menuNameKor}" required> <br><br>
	메뉴명(영문) <input type="text" name="menuNameEng" value="${dto.menuNameEng}" required> <br><br>
	메뉴유형 <input type="text" name="menuType" value="${dto.menuType}" required> <br><br>
	메뉴가격 <input type="number" name="menuPrice" value="${dto.menuPrice}" required> <br><br>
	<button>변경하기</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>