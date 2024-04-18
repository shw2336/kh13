package com.kh.spring19.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.EmpDto;

@Repository
public class EmpDao {
	@Autowired
	private SqlSession sqlSession;

	public List<EmpDto> selectList() {
		return sqlSession.selectList("emp.list");
	}

	public EmpDto selectOne(int empNo) {
		return sqlSession.selectOne("emp.find", empNo);
	}
	
	
}