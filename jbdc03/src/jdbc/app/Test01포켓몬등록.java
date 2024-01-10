package jdbc.app;

import jbdc.dto.PocketmonDto;
import jdbc.dao.PocketmonDao;

public class Test01포켓몬등록 {
	public static void main(String[] args) {

		// 등록을 모듈화 시켜서처리하고 싶으면 어떻게 하나?
		// -PocketmonDao라는 클래스를 만들어서 등록과 관련된 코드를 보관
		// 결과를 반환하지 않는 메소드 → void

		// 입력
		PocketmonDto dto = new PocketmonDto();
		dto.setPocketmonNo(111);
		dto.setPocketmonName("테스트몬");
		dto.setPocketmonType("테스트");
		
		// 처리
		PocketmonDao dao = new PocketmonDao();
		dao.insert(dto);
		
		// 출력
		System.out.println("포켓몬스터 등록 완료");
	}

}
