package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.StudentDao;
import com.kh.spring07.dto.StudentDto;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/add")
	public String insert(@ModelAttribute StudentDto dto) {
		dao.insert(dto);
		return "학생 등록 완료";
	}
	
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column !=null && keyword != null;
		List<StudentDto> list;
		if(isSearch) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		StringBuffer buffer = new StringBuffer();
		for(StudentDto dto : list) {
			buffer.append(dto.getStudentId());
			buffer.append(".");
			buffer.append("이름 : " + dto.getName() + "<br>");
			buffer.append("국어점수 : " + dto.getKoreanScore() + "<br>");
			buffer.append("수학점수 : " + dto.getMathScore() + "<br>");
			buffer.append("영어점수 : " + dto.getEnglishScore() + "<br>");
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int studentId) {
		StudentDto dto = dao.selectOne(studentId);
		if(dto != null) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("이름 : " + dto.getName() + "<br>");
			buffer.append("국어점수 : " + dto.getKoreanScore() + "<br>");
			buffer.append("수학점수 : " + dto.getMathScore() + "<br>");
			buffer.append("영어점수 : " + dto.getEnglishScore() + "<br>");
			buffer.append("<br>");
			return buffer.toString();
		}
		else {
			return "존재하지 않는 학생입니다";
		}
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute StudentDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "학생 정보 수정 완료";
		}
		else {
			return "존재하지 않는 학생입니다";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int studentId) {
		if(dao.delete(studentId)) {
			return "학생 정보 삭제 완료";
		}
		else {
			return "존재하지 않는 학생입니다";
		}
	}
	
	
}
