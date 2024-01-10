package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;

public class Test09메뉴삭제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MenuDao dao = new MenuDao();
		boolean result = dao.delete(sc.nextInt());
		
		if(result) {
			System.out.println("메뉴 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴입니다");
		}
	}
	

}
