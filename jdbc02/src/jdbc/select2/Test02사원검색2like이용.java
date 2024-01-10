package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;

import jdbc.util.JdbcHelper;

public class Test02사원검색2like이용 {
	public static void main(String[] args) {
		
		//like 검색을 이용!!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String keyword = sc.nextLine();
		sc.close();
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp "
				+ "where emp_name  like '%' || ? || '%' "//그냥 like ? || '%' 해도 됨
				+ "order by emp_name asc, emp_no asc"; 
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper(); 
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		
		
//		if(list.size() == 0) {
		if(list.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다");
		}
		else {
			System.out.println("조회결과 : " + list.size() + "개");
			for(EmpDto dto : list) {
				System.out.println("이름 : " + dto.getEmpName() +", " + "부서 : " + dto.getEmpDept());
			}
		}
		
	}

}
