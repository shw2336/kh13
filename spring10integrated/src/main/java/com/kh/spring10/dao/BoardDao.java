package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardMapper mapper;
	
	//게시판 등록
	public void insert(BoardDto boardDto) {
		String sql = "insert into board("
				+ "board_no, board_title, board_content, board_writer"
				+ ") "
				+ "values(board_seq.nextval, ?, ?, ?)";
		Object[] data = {
				boardDto.getBoardTitle(), boardDto.getBoardContent(), boardDto.getBoardWriter()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//게시판 수정
	public boolean update(BoardDto boardDto) {
		String sql = "update board set board_title=?, board_content=? where "
				+ "board_no=?";
		Object[] data = {
				boardDto.getBoardTitle(), boardDto.getBoardContent(), 
				boardDto.getBoardNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//게시판 삭제
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//게시판 정렬
	public List<BoardDto> selectList() {
		String sql = "select * from board order by board_no asc";
		// Object[] data = {};
		return jdbcTemplate.query(sql, mapper);
	}
		
	public List<BoardDto> selectList(String column, String keyword) {
		String sql = "select * from board where instr(" + column + ", ?) > 0 " + "order by " + column
				+ " asc, board_no asc";
		Object[] data = { keyword };
		return jdbcTemplate.query(sql, mapper, data);	
	}
	
	
	//게시판상세
	public BoardDto selectOne(String boardNo) {
		String sql = "select * from member where board_no = ?";
		Object[] data = { boardNo };
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	
	
	// 게시글 수정일 변경(수정, Update)
	public boolean updateBoardInsert(int boardNo) {
		String sql = "update board " + "set board_etime=sysdate " + "where board_no = ?";
		Object[] data = { boardNo };
		return jdbcTemplate.update(sql, data) > 0;
	}
	

}
