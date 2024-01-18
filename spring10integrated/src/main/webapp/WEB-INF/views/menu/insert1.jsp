<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>메뉴 등록</h1>
    
    <form action="insert" method="post">
        한글메뉴명 <input name="menuNameKor" required> <br> <br>
        영문메뉴명 <input name="menuNameEng" required> <br> <br>
        
<%--    메뉴타입 <input name="menuType" type="text"> <br> <br> --%>
      <%--
          <select>를 사용하면 주어진 목록 중에서 선택시킬 수 있다
          <select name="...">
              <option value="...">...</option>
              <option value="...">...</option>
              <option value="...">...</option>
             <select>
       --%>
        메뉴타입 <select name="menuType" required>
            <option value="">선택하세요</option>
            <option value="커피">커피</option>
            <option value="스무디">스무디</option>
            <option value="에이드">에이드</option>
            <option value="디저트">디저트</option>
        </select>
        <br> <br>
        메뉴가격 <input name="menuPrice" type="number" required> <br> <br>
        <button>메뉴등록</button>
    </form>