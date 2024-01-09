package jdbc.delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보삭제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		
		int result = jdbcTemplate.update(sql, data);
		
		//출력
		if(result > 0) {
			System.out.println("메뉴 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호");
		}
		
	}

}
