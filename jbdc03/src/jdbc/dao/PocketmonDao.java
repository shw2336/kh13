package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jbdc.dto.PocketmonDto;
import jdbc.util.JdbcHelper;

//DAO(Data Access Object)
//-해당 테이블에 대한 CRUD 코드를 가진 클래스
public class PocketmonDao {
	//결과를 반환하지 않는 메소드 → void
	//등록 메소드
//	public void insert(int pocketmonNo, String pocketmonName, String pocketmontype) {
	public void insert(PocketmonDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type) values(?, ?, ?)";
		Object[] data = {dto.getPocketmonNo(), dto.getPocketmonName(), dto.getPocketmonType()};
		
		jdbcTemplate.update(sql, data);
		
	}
	
	//수정 메소드
	//삭제 메소드
	//목록 메소드
	//검색 메소드
	
}
