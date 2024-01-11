package jdbc.app;

import java.text.DecimalFormat;
import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test14메뉴상세 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuNo = sc.nextInt();
		
		MenuDao dao = new MenuDao();
		MenuDto dto = dao.selectOne(menuNo);
		
		if(dto != null) {
			DecimalFormat fmt = new DecimalFormat("#,##0");
			System.out.println("메뉴이름 : " + dto.getMenuNameKor());
			System.out.println("메뉴가격 : " + fmt.format(dto.getMenuPrice()));
		}
		else {
			System.out.println("메뉴 조회 실패");
		}
		
		
	}
}
