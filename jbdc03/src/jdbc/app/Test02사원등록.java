package jdbc.app;

import jbdc.dto.EmpDto;
import jdbc.dao.EmpDao;

public class Test02사원등록 {
	public static void main(String[] args) {
		
		EmpDto dto = new EmpDto();
		dto.setEmpNo(27);
		dto.setEmpName("멋진형우");
		dto.setEmpDept("코딩수업부");
		dto.setEmpDate("2019-09-09");
		dto.setEmpSal(18000000);
		
		EmpDao dao = new EmpDao();
		dao.insert(dto);
		
		System.out.println("사원등록완료");
		
	}

}
