package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jbdc.dto.MenuDto;
import jdbc.mapper.MenuMapper;
import jdbc.util.JdbcHelper;

public class MenuDao {
	
	//등록 메소드
	public void insert(MenuDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "insert into menu(menu_no, menu_name_kor, "
				+ "menu_name_eng, menu_type, menu_price) "
				+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		
		Object[] data = {dto.getMenuNameKor(), 
				dto.getMenuNameEng(), dto.getMenuType(), dto.getMenuPrice()};
		
		jdbcTemplate.update(sql, data);
		
	}

	//수정 메소드
	public boolean update(MenuDto dto) {
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update menu set menu_name_kor=?, menu_name_eng=?, "
				+ "menu_type=?, menu_price=? where menu_no=?";
		
		Object[] data = {
				dto.getMenuNameKor(), dto.getMenuNameEng(), dto.getMenuType(), 
				dto.getMenuPrice(), dto.getMenuNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//삭제 메소드
	public boolean delete(int menuNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		
		return jdbcTemplate.update(sql, data) > 0;
		
	}
	
	//목록 메소드
	public List<MenuDto> selectList(){
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from menu order by menu_no asc";
		MenuMapper mapper = new MenuMapper();
		return jdbcTemplate.query(sql, mapper);
	}
	
	//상세 메소드
	public MenuDto selectOne(int MenuNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from menu where menu_no=?";
		Object[] data = {MenuNo};
		MenuMapper mapper = new MenuMapper();
		List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
		
		
	
	
	//검색 메소드
}
}
