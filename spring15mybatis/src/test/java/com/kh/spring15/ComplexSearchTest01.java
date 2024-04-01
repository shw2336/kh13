package com.kh.spring15;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ComplexSearchTest01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		List<MemberDto> list = sqlSession.selectList("member.list");
		for(MemberDto memberDto : list) {
			log.debug("member = {}", memberDto);
		}
	}
}
