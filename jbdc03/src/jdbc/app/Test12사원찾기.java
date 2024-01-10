package jdbc.app;

import java.util.Scanner;

import jbdc.dto.EmpDto;
import jdbc.dao.EmpDao;

public class Test12사원찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int empNo = sc.nextInt();
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(empNo);
		
		if(dto == null) {
			System.out.println("정보 조회 실패");
		}
		else {
		System.out.println("해당 사번에 대한 사원정보를 조회합니다" + "\n" 
		+ "사원 이름 : "+ dto.getEmpName() + " / 소속 부서 : " + dto.getEmpDept() 
		+ " / 입사일 : " + dto.getEmpDate() + " / 급여 : " + dto.getEmpSal());
			
		}

	}
}

