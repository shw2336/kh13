package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03데이터변수화3 {
	public static void main(String[] args) {

//		create table emp(
//				emp_no number primary key,--사원번호, 시퀀스로 자동 부여
//				emp_name varchar2(21) not null,--사원의 한글 이름
//				emp_dept varchar2(30) not null,--사원의 소속 부서
//				emp_date char(10) not null,--사원의 입사일
//				emp_sal number default 0 not null check(emp_sal >= 0)--사원의 급여(원)
//				);
//				create sequence emp_seq;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사원명 : ");
		String emp_name = sc.nextLine();
		System.out.print("부서명 : ");
		String emp_dept = sc.nextLine();
		System.out.print("입사일 : ");
		String emp_date = sc.nextLine();
		System.out.print("급여액 : ");
		String emp_sal = sc.nextLine();
		
		String sql = "insert into emp("
						+ "emp_no, emp_name, emp_dept, emp_date, emp_sal"
					+ ") "
					+ "values(emp_seq.nextval, ?, ?, ?, ?)";
		
		Object[] data = {emp_name, emp_dept, emp_date, emp_sal};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13");
		dataSource.setPassword("kh13");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		//실행 시 홀더가 있는 구문과 그 데이터를 같이 주면서 실행 요청한다
		jdbcTemplate.update(sql, data);
		System.out.println("실행 완료");

	}
}