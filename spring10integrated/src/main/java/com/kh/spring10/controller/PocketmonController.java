package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.PocketmonDao;

@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	
	@Autowired
	private PocketmonDao dao;

	//등록을 위한 페이지들
	@RequestMapping("/insert1")
	public String insert1() {
		return "/WEB-INF/views/pocketmon/insert1.jsp";
	}
	
	
	
	
	
	
}
