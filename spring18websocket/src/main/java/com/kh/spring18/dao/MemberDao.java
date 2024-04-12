package com.kh.spring18.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring18.dto.MemberDto;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	public MemberDto selectOnebyMemberPw(MemberDto memberDto) {
		MemberDto findDto = sqlSession.selectOne("member.find", memberDto.getMemberId());
		if(findDto == null) return null;
		
		boolean isValid = memberDto.getMemberPw().equals(findDto.getMemberPw());
		return isValid ? findDto : null;
	
	}
	
}
