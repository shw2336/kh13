package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test05사원정보변경 {
	public static void main(String[] args) {
		
		EmpDto dto = new EmpDto();
		dto.setEmpNo(5);
		dto.setEmpName("배고픈하마");
		dto.setEmpDept("하마연구소");
		dto.setEmpDate("2018-09-04");
		dto.setEmpSal(500000);
		
		EmpDao dao = new EmpDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("사원정보가 변경되었습니다");
		}
		else {
			System.out.println("존재하지 않는 사원 번호입니다");
		}
	}

}
