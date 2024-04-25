package com.kh.spring19.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.BookDto;

@Repository
public class BookDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<BookDto> selectList() {
		return sqlSession.selectList("book.list");
	}
	
	//무한 스크롤을 위한 페이징 메소드
	//- 받아야 하는 정보 : 페이지번호, 페이지크기
	//- 반환해야 하는 정보 : 도서 목록, List<BookDto>
	public List<BookDto> selectListByPaging(int page, int size) {
		int beginRow = page * size - (size-1);
		int endRow = page * size;
		
		Map<String, Object> data = new HashMap<>();
		data.put("beginRow", beginRow);
		data.put("endRow", endRow);
		return sqlSession.selectList("book.listByPaging", data);
	}
	
	public int count() {
		return sqlSession.selectOne("book.count");
	}
	
}