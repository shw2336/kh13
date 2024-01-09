package jdbc.select2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.PocketmonDto;
import jdbc.select.PocketmonMapper;
import jdbc.util.JdbcHelper;

public class Test01포켓몬검색2 {
	public static void main(String[] args) {
		//유사검색
		//- 시작검색 or 포함검색
		//- 상황에 맞게 like 연산자 또는 instr 함수를 사용 지금은 instr을 사용 포함만 되어있으면 찾을 수 있어
		
		//데이터 준비
		String keyword = "피카";
		
		//keyword += "%";
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon "
				+ "where instr(pocketmon_name, ?) > 0"; //?는 작은따음표 안해도 알아서 생기기때문에 안써줘도 됨
		Object[] data = {keyword};
		PocketmonMapper mapper = new PocketmonMapper(); //아까 Mapper 만들어서 그냥 써도 갖고오는거
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		
		//출력
		System.out.println("조회결과 : " + list.size() + "개");
		for(PocketmonDto dto : list) {
			System.out.println(dto.getPocketmonName());
		}
		
	}

}
