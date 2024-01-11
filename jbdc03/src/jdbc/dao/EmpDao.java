package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.mapper.EmpMapper;
import jdbc.util.JdbcHelper;

public class EmpDao {
	
	//등록 메소드
	public void insert(EmpDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
	
		String sql = "insert into emp(emp_no, emp_name, "
				+ "emp_dept, emp_date, emp_sal) "
				+ "values(emp_seq.nextval, ?, ?, ?, ?)";
		
		Object[] data = {dto.getEmpName(), dto.getEmpDept(), 
				dto.getEmpDate(), dto.getEmpSal()};
		
		jdbcTemplate.update(sql, data);
		
		
	}

	//수정 메소드
	public boolean update(EmpDto dto) {
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update emp set emp_name=?, "
				+ "emp_dept=?, emp_date=?, emp_sal=? where emp_no=?";
//							여기서 ?는 홀더 라고 부른다
		Object[] data = {
				dto.getEmpName(), dto.getEmpDept(), 
				dto.getEmpDate(), dto.getEmpSal(), dto.getEmpNo()};
				
				return jdbcTemplate.update(sql, data) > 0;
//				int result = jdbcTemplate.update(sql, data);
//				if(result > 0) return true;
//				else return false;
		}
	
	//삭제 메소드
	public boolean delete(int empNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete emp where emp_no=?";
		Object[] data = {empNo};
		
		return jdbcTemplate.update(sql, data) > 0;
		
	}

	//목록 메소드
	public List<EmpDto> selectList(){
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp order by emp_no asc";
		EmpMapper mapper = new EmpMapper();
		return jdbcTemplate.query(sql, mapper);
	}
	
	//항목-키워드 검색
	public List<EmpDto> selectList(String column, String keyword) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where instr("+column+", ?) > 0";
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	//상세 메소드
	public EmpDto selectOne(int empNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_no=?";
		Object[] data = {empNo};
		EmpMapper mapper = new EmpMapper();
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
		
	}
	

	}

