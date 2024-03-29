package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpUpdateTest01 {

	@Autowired
	private EmpDao empDao;
	
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(3);
		empDto.setEmpName("이예린");
		empDto.setEmpDept("콘치즈조아");
		empDto.setEmpDate("2023-03-03");
		empDto.setEmpSal(3333333);
		
		if(empDao.update(empDto)) {
			log.debug("정보 변경 성공");
		}
		else {
			log.debug("존재하지 않는 대상");
		}
	}
}
