package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpInsertTest01 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(3);
		empDto.setEmpName("이예린");
		empDto.setEmpDept("콘치즈부");
		empDto.setEmpDate("2023-03-03");
		empDto.setEmpSal(333333333);
		
		empDao.insert(empDto);
		log.debug("등록 완료");
	}
}
