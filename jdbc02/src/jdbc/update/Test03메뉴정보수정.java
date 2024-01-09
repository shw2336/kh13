package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보수정 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menuNo = sc.nextInt();
		String menuNameKor = sc.next();
		String menuNameEng = sc.next();
		String menuType = sc.next();
		int menuPrice = sc.nextInt();
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update menu "
				+ "set menu_name_kor=?, menu_name_eng=?, "
				+ "menu_type=?, menu_price=? where menu_no=?";
		
		Object[] data = {menuNameKor, menuNameEng, menuType, menuPrice, menuNo};
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("정보 변경 완료");
	}
	

}
