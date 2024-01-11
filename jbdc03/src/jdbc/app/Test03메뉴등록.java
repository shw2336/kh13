package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test03메뉴등록 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MenuDto dto = new MenuDto();
//		int setMenuNo = sc.nextInt();
//		dto.setMenuNo(setMenuNo);
//												    넘버를 직접 설정해주고 싶을때만 하자()
//		넘버를 설정하려면 Dao에서도 
//		(sql에 values에서 menu_seq.nexval을 ?로 바꿔주고)
//		(data에 dto.getMenuNo()넣어주기)
//		sc.nextLine();
		
		System.out.print("메뉴명(한글) : ");
		dto.setMenuNameKor(sc.nextLine());
		System.out.print("메뉴명(영문) : ");
		dto.setMenuNameEng(sc.nextLine());
		System.out.print("메뉴종류 : ");
		dto.setMenuType(sc.nextLine());
		System.out.print("메뉴가격 : ");
		dto.setMenuPrice(sc.nextInt());
		
		MenuDao dao = new MenuDao();
		dao.insert(dto);
		
		System.out.println("메뉴 등록 완료!");
		
	}

}
