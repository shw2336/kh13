package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.PocketmonDto;
import com.kh.spring10.mapper.PocketmonMapper;

//DAO도 이제부터는 등록을 해야 한다
//- @Repository는 파일이나 데이터베이스와 같이 영속성 개체를 제어하는 도구
@Repository
public class PocketmonDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PocketmonMapper mapper;
	
	//생성
	public void insert(PocketmonDto dto) {
		//	public String insert2(@ModelAttribute PocketmonDto dto) {
		String sql = "insert into pocketmon(pocketmon_no, pocketmon_name, pocketmon_type) values(?, ?, ?)";
		Object[] data = {dto.getPocketmonNo(), dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql, data);
	}
	
	//수정
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon set pocketmon_name=?, pocketmon_type=? where pocketmon_no=?";
		Object[] data = {dto.getPocketmonName(), dto.getPocketmonType(), dto.getPocketmonNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//삭제
	public boolean delete(int pocketmonNo) {
		String sql = "delete pocketmon where pocketmon_no=?";
		Object[] data = {pocketmonNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//단순목록
	public List<PocketmonDto> selectList() {
		String sql = "select * from pocketmon order by pocketmon_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	//검색(항목+키워드)
	public List<PocketmonDto> selectList(String column, String keyword) {
		String sql = "select * from pocketmon where instr("+column+", ?) > 0 "
											+ "order by "+column+" asc, pocketmon_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
		
	}
	
	//검색(상세)
	public PocketmonDto selectOne(int pocketmonNo) {
		String sql = "select * from pocketmon where pocketmon_no = ?";
		Object[] data = {pocketmonNo};
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	
	
	
	
	
	
	
	
	
}
