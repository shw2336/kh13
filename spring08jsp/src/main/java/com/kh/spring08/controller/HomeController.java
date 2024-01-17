package com.kh.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		//return "<h1> Welcome<h1>"; //글자 진하게 보여줌!
		return "/WEB-INF/views/welcome.jsp";
	}
}
