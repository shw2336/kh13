package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.MenuDao;
import com.kh.spring06.dto.MenuDto;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		
		return "메뉴 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute MenuDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "메뉴 수정 완료";
		}
		else {
			return "존재하지 않는 메뉴 번호";
		}
	}
	
	
	
	
}
