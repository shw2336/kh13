package jdbc.app;

import java.util.List;
import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test16사원검색 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.사원명, 2.부서명 선택! : ");
		int b = sc.nextInt();
		
		String column;
		
		if(b == 1) {
			column = "emp_name";
		}
		else {
			column = "emp_dept";
		}
		
		System.out.print("검색어 : ");
		String a = sc.next();
		String keyword = a;
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.selectList(column, keyword);
		
		System.out.println("검색결과 : " + list.size() + "건");
		
		if(list.isEmpty()) {
			System.out.println("데이터 없음");
		}
		else {
			for(EmpDto dto : list) {
				System.out.println("- "+ dto.getEmpName() + " (" + dto.getEmpDept() + ")");
			}
		}
		
	}

}
