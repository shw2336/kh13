package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	
	//게시판 등록
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/board/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute BoardDto boardDto, 
			HttpSession session) {
		String loginId = (String)session.getAttribute("loginId");
		boardDao.insert(boardDto);
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword, 
			Model model) {
		boolean isSearch = column != null && keyword != null;
//		List<BoardDto> list = isSearch ? dao.selectList(column, keyword) : dao.selectList();
		List<BoardDto> list;
		if(isSearch) {
			list = boardDao.selectList(column, keyword);
		}
		else {
			list = boardDao.selectList();
		}
		
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}
	

}
