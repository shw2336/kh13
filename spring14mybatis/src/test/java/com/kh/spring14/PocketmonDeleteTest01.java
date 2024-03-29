package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.PocketmonDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PocketmonDeleteTest01 {

	@Autowired
	private PocketmonDao pocketmonDao;
	
	@Test
	public void test() {
		int pocketmonNo = 50;
		if(pocketmonDao.delete(pocketmonNo)) {
			log.debug("삭제 성공");
		}
		else {
			log.debug("존재하지 않는 대상");
		}
	}
	
}
