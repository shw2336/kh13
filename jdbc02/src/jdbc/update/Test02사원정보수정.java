package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보수정 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int empNo = sc.nextInt();
		String empName = sc.next();
		String empDept = sc.next();
		String empDate = sc.next();
		int empSal = sc.nextInt();
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update emp "
				+ "set emp_name=?, emp_dept=?, "
				+ "emp_date=?, emp_sal=? where emp_no=?";
		
		Object[] data = {empName, empDept, empDate, empSal, empNo};
		
		jdbcTemplate.update(sql, data);
		
	
		System.out.println("정보 변경 완료");
	}

}
