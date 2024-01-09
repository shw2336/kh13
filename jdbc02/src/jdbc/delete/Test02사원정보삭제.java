package jdbc.delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보삭제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int empNo = sc.nextInt();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "delete emp where emp_no=?";
		Object[] data = {empNo};
		
		int result = jdbcTemplate.update(sql, data);
		
		//출력
		if(result > 0) {
			System.out.println("사원 정보 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 사원입니다");
		}
		
	}

}
