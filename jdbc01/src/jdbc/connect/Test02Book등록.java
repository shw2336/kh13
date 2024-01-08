package jdbc.connect;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02Book등록 {
	public static void main(String[] args) {
		//Spring JDBC
		//- Spring 에서 제공하는 JDBC 도구들을 사용한 DBMS 연결방법
		//-외부 라이브러리 등록 필요 
		
		//[1] 연결 생성
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); //사용자아이디
		dataSource.setPassword("kh13"); //비밀번호
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); //DB종류 지정
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //DB연결유형 + 위치 xe(교육용버전)말고 ORCL도 있다
		
	
//		book_id - 50//		book_title - 자바신공
//		book_author - 열혈강사//		book_publication_date - 2023-10-01
//		book_price - 5$//		book_publisher - wikidocs
//		book_page_count - 199//		book_genre - Education
		
		String sql = "insert into book(book_id, book_title, book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, book_genre) " 
				+ "values(54, '자바신공', '열혈강사', '2023-10-01', 5, 'wikidocs', 199, 'Education')";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql);
				
		System.out.println("완료!");
	}

}
