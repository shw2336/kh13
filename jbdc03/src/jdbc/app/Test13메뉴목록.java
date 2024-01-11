package jdbc.app;

import java.util.List;

import jbdc.dto.MenuDto;
import jdbc.dao.MenuDao;

public class Test13메뉴목록 {
	public static void main(String[] args) {
		
		MenuDao dao = new MenuDao();
		List<MenuDto> list = dao.selectList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다");
		}
		for (MenuDto menu : list) {
			System.out.println("한글메뉴 : " + menu.getMenuNameKor() + 
					", 가격 : " + menu.getMenuPrice());
		}
		
	}

}
