package jdbc.select2;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.PocketmonMapper;
import jdbc.util.JdbcHelper;

public class Test01포켓몬검색 {
	public static void main(String[] args) {
		//유사검색
		//- 시작검색 or 포함검색
		//- 상황에 맞게 like 연산자 또는 instr 함수를 사용
		
		//데이터 준비
		String keyword = "피카";
		
		//keyword += "%";
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon "
				+ "where pocketmon_name like ? || '%'"; //?는 작은따음표 안해도 알아서 생기기때문에 안써줘도 됨
		Object[] data = {keyword};
		//PocketmonMapper mapper = new PoketmonMapper();
		
		
	}

}
