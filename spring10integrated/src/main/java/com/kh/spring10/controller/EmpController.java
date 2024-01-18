package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dto.EmpDto;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpDao dao;
	
	//등록
	//@RequestMapping("/insert1")
	@GetMapping("/insert")//GET방식 - 일반적인 주소를 이용한 접근
	public String insert() {
		return "/WEB-INF/views/emp/insert1.jsp";
	}
	
	//@RequestMapping("/insert2")
	@PostMapping("/insert")//POST방식 - Form을 이용한 데이터 전송 접근
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		//return "redirect:/emp/insert3";//절대
		return "redirect:insert3";//상대
	}
	
	@RequestMapping("/insert3")
	public String insert3() {
		return "/WEB-INF/views/emp/insert3.jsp";
	}
	
	@GetMapping("/edit")
	public String edit() {
		return "/WEB-INF/views/emp/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute EmpDto dto) {
		if(dao.update(dto)) {
			//return "redirect:/emp/editSuccess"; //절대경로
			return "redirect:editSuccess"; //상대경로
		}
		else {
			//return "redirect:/emp/editFail"; //절대경로
			return "redirect:editFail"; //상대경로
		}
	}
	
	@RequestMapping("/editSuccess")
	public String editSuccess() {
		return "/WEB-INF/views/emp/editSuccess.jsp";
	}
	
	@RequestMapping("/editFail")
	public String editFail() {
		return "/WEB-INF/views/emp/editFail.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
