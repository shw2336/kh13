package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.select.PocketmonDto;
import jdbc.util.JdbcHelper;

public class Test04사원항목검색 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.사원명, 2.부서명, 3.입사일 택1 : ");
		int choice = sc.nextInt();
		String column;
		if(choice == 1) {
			column = "emp_name";
		}
		else if(choice == 2) {
			column = "emp_dept";
		}
		else {
			column = "emp_date";
		}
		
		System.out.print("검색어 : ");
		String keyword = sc.next();
		
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		EmpMapper mapper = new EmpMapper();
		
//		String sql = "select * from emp where "+column+" like ? || '%'";
		String sql = "select * from emp where instr("+column+", ?) > 0 ";
		Object[] data = {keyword};
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		if(list.isEmpty()) {
			System.out.println("검색 결과 없음");
		}
		else {
			for(EmpDto dto : list) {
				System.out.print("이름 : " + dto.getEmpName());
				System.out.print("(");
				System.out.print("부서 : " + dto.getEmpDept());
				System.out.print(")");
			}
		}
	}

}
