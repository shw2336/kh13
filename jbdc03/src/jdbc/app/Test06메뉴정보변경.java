package jdbc.app;

import java.util.Scanner;

import jbdc.dto.MenuDto;
import jdbc.dao.MenuDao;

public class Test06메뉴정보변경 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MenuDto dto = new MenuDto();
		dto.setMenuNo(sc.nextInt());
		sc.nextLine();
		dto.setMenuNameKor(sc.nextLine());
		dto.setMenuNameEng(sc.nextLine());
		dto.setMenuType(sc.nextLine());
		dto.setMenuPrice(sc.nextInt());
		
		MenuDao dao = new MenuDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("메뉴정보변경");
		}
		else {
			System.out.println("존재 하지 않는 메뉴입니다");
		}
		
	}

}
