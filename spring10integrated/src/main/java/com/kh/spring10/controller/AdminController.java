package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dao.MenuDao;
import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.dto.MenuDto;
import com.kh.spring10.vo.StatVO;

import jakarta.servlet.http.HttpSession;

//관리자가 이용할 수 있는 기능을 제공하는 컨트롤러
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	//포켓몬스터 통계
	@RequestMapping("/stat/pocketmon")
	public String statPocketmon(Model model) {
		List<StatVO> list = pocketmonDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/pocketmon.jsp";
	}
	
	@Autowired
	private EmpDao empDao;
	
	//사원 통계
	@RequestMapping("/stat/emp")
	public String statEmp(Model model) {
		List<StatVO> list = empDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/emp.jsp";
	}
	
	@Autowired
	private MenuDao menuDao;
	
	//메뉴 통계
	@RequestMapping("/stat/menu")
	public String statMenu(Model model) {
		List<StatVO> list = menuDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/menu.jsp";
	}
	
	@Autowired
	private MemberDao memberDao;
	
	//회원 통계
	@RequestMapping("/stat/member")
	public String statMember(Model model) {
		List<StatVO> list = memberDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/member.jsp";
	}
	
	@GetMapping("/member/search")
	public String search(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword, 
			Model model) {
		boolean isSearch = column != null && keyword != null;
//		List<MemberDto> list = isSearch ? dao.selectList(column, keyword) : dao.selectList();
		List<MemberDto> search;
		if(isSearch) {
			search = memberDao.selectList(column, keyword);
		}
		else {
			search = memberDao.selectList();
		}
		
		model.addAttribute("search", search);
		return "/WEB-INF/views/admin/member/search.jsp";
	}
	
	@PostMapping("/member/search")
	public String search() {
		return "redirect:detail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
