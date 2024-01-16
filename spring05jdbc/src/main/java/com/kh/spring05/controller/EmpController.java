package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		
		return "사원 등록 완료";

}

@RequestMapping("/edit")
public String edit(@ModelAttribute EmpDto dto) {
	boolean result = dao.update(dto);
	if(result) {
		return "사원정보 수정 완료";
	}
	else {
		return "존재하지 않는 사원 번호";
	}
}

@RequestMapping("/delete")
public String delete(@RequestParam int empNo) {
	if(dao.delete(empNo)) {
		return "사원 삭제 완료";
	}
	else {
		return "존재하지 않는 사원";
	}
}

@RequestMapping("/list")
public String list(
		@RequestParam(required = false) String column, 
		@RequestParam(required = false) String keyword
		) {
	boolean isSearch = column != null && keyword != null;
		List<EmpDto> list;
		if(isSearch) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		
		StringBuffer buffer = new StringBuffer();
		for(EmpDto dto : list) {
			buffer.append(dto.getEmpNo());
			buffer.append(".");
			buffer.append(dto.getEmpName());
			buffer.append(dto.getEmpDept());
			buffer.append(dto.getEmpDate());
			buffer.append(dto.getEmpSal());
			buffer.append("<br>");
		}
		return buffer.toString();
}











}