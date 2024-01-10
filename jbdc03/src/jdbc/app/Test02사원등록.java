package jdbc.app;

import jbdc.dto.EmpDto;
import jdbc.dao.EmpDao;

public class Test02사원등록 {
	public static void main(String[] args) {
		
		EmpDto dto = new EmpDto();
		dto.setEmpName("형우아님");
		dto.setEmpDept("코딩수업임");
		dto.setEmpDate("2019-08-12");
		dto.setEmpSal(168000159);
		
		EmpDao dao = new EmpDao();
		dao.insert(dto);
		
		System.out.println("사원등록완료");
		
	}

}
