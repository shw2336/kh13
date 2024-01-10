package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jbdc.dto.EmpDto;
import jdbc.util.JdbcHelper;

public class EmpDao {
	
	public void insert(EmpDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
	
		String sql = "insert into emp(emp_no, emp_name, "
				+ "emp_dept, emp_date, emp_sal) "
				+ "values(?, ?, ?, ?, ?)";
		
		Object[] data = {dto.getEmpNo(), dto.getEmpName(), dto.getEmpDept(), 
				dto.getEmpDate(), dto.getEmpSal()};
		
		jdbcTemplate.update(sql, data);
		
		
	}

}
