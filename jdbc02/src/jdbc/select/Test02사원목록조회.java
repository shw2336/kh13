package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원목록조회 {
	public static void main(String[] args) {
		
//		String sql = "select * from emp";
		String sql = "select * from emp order by emp_no asc"; //order by emp_no asc 는 정렬해주는거!
		//Object[] data = {}; 없어서 안쓰는거임 있으면 써야됨!!!
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		EmpMapper mapper = new EmpMapper();
		
		
		
		List<EmpDto> list = jdbcTemplate.query(sql, mapper);
		
		System.out.println("데이터 개수 : " + list.size());
		System.out.println();
		
		for (EmpDto dto : list) {//list에 있는거 다 꺼내서 dto로 사용하겠다
			System.out.println(dto.getEmpName() + ", " + dto.getEmpDept());
		}
		System.out.println();
		
		for (EmpDto empDto : list) { //list에 있는거 다 꺼내서 empDto로 사용하겠다
            System.out.println(empDto.getEmpNo() + " | " + empDto.getEmpName() + " | " + empDto.getEmpDept() + " | "
                    + empDto.getEmpDate() + " | " + empDto.getEmpSal());
        }
		
		
	
//		System.out.println();
		
	}

}
