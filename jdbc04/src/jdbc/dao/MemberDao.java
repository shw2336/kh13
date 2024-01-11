package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcHelper;

public class MemberDao {
	
	//등록메소드
	public void insert(MemberDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "insert into member"
				+ "("
				+ "member_id, "
				+ "member_pw, "
				+ "member_nick, "
				+ "member_birth, "
				+ "member_contact, "
				+ "member_email, "
				+ "member_post, "
				+ "member_address1, "
				+ "member_address2"
				+ ") "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {
				dto.getMemberId(), 
				dto.getMemberPw(), 
				dto.getMemberNick(), 
				dto.getMemberBirth(), 
				dto.getMemberContact(), 
				dto.getMemberEmail(), 
				dto.getMemberPost(), 
				dto.getMemberAddress1(), 
				dto.getMemberAddress2()
				};
		
				jdbcTemplate.update(sql, data);
	}
	
	//수정 메소드
	public boolean update(MemberDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update member set "
				+ "member_pw=?, "
				+ "member_nick=?, "
				+ "member_birth=?, "
				+ "member_contact=?, "
				+ "member_email=?, "
				+ "member_post=?, "
				+ "member_address1=?, "
				+ "member_address2=?, "
				+ "member_level=?, "
				+ "member_point=?, "
				+ "member_join=?, "
				+ "member_login=? "
				+ "where member_id=?";
		
		Object[] data = {
				dto.getMemberPw(), 
				dto.getMemberNick(), 
				dto.getMemberBirth(), 
				dto.getMemberContact(), 
				dto.getMemberEmail(), 
				dto.getMemberPost(), 
				dto.getMemberAddress1(),
				dto.getMemberAddress2(), 
				dto.getMemberLevel(), 
				dto.getMemberPoint(), 
				dto.getMemberJoin(), 
				dto.getMemberLogin()
				};
		return jdbcTemplate.update(sql, data) > 0;
	}

	//삭제 메소드
	public boolean delete(String memberId) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete member where member_id=?";
		Object[] data = {memberId};
		
		return jdbcTemplate.update(sql, data) >0;
	}

	//목록메소드
	public List<MemberDto> selectList() {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from member order by member_no asc";
		MemberMapper mapper = new MemberMapper();
		return jdbcTemplate.query(sql, mapper);
	}
	
	//항목 - 키워드 검색
	public List<MemberDto> selectList(String column, String keyword) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from member where instr("+column+", ?) > 0";
		Object[] data = {keyword};
		MemberMapper mapper = new MemberMapper();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	//상세 메소드
	public MemberDto selectOne(String memberId) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from member where member_id=?";
		Object[] data = {memberId};
		MemberMapper mapper = new MemberMapper();
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
