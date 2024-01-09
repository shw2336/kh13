package jdbc.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴조회 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴명을 입력하세요 : ");
		
		String input = sc.nextLine();
		
		//String sql = "select * from menu order by menu_no asc";
		//String sql = "select * from menu where menu_name_kor = ?";
		String sql = "select * from menu where menu_name_kor = ? order by menu_no asc";
		Object[] data = {input};
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		MenuMapper mapper = new MenuMapper();
		
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		//명령은 두개뿐이다 update 또는 query
		
		System.out.println("데이터 개수 : " + list.size());
		System.out.println();
		
		for(MenuDto dto : list) {
			System.out.println(dto.getMenuNo() + "번 " + dto.getMenuNameKor() + ", " 
		+ dto.getMenuType() + ", " + dto.getMenuPrice() + "원" );
		}
		
	}

}
