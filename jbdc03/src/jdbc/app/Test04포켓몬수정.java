package jdbc.app;

import jbdc.dto.PocketmonDto;
import jdbc.dao.PocketmonDao;

public class Test04포켓몬수정 {
	public static void main(String[] args) {
		
		//포켓몬스터 정보 수정 코드(+DAO)
		
		PocketmonDto dto = new PocketmonDto();
		dto.setPocketmonNo(26);
		dto.setPocketmonName("바꾼이름");
		dto.setPocketmonType("테스트");
		
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("포켓몬스터 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 몬스터 번호");
		}
	}

}
