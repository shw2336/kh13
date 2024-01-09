package jdbc.delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보삭제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "delete emp where emp_name=?";
		Object[] data = {empName};
		
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
