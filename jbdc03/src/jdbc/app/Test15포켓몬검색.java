package jdbc.app;

import java.util.List;

import jbdc.dto.PocketmonDto;
import jdbc.dao.PocketmonDao;

public class Test15포켓몬검색 {
	public static void main(String[] args) {
		
		String column = "pocketmon_type";
		String keyword = "테스트";
		
		PocketmonDao dao = new PocketmonDao();
		List<PocketmonDto> list = dao.selectList(column, keyword);
		
		if(list.isEmpty()) {
			System.out.println("표시할 데이터가 없습니다");
		}
		else {
			for(PocketmonDto dto : list) {
				System.out.println(dto.getPocketmonName());
			}
		}
		
	}

}
