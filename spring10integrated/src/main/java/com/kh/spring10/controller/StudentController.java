package com.kh.spring10.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.StudentDao;
import com.kh.spring10.dto.StudentDto;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDao studentDao;
	
		//학생 정보 등록
		@GetMapping("/add")
		public String add() {
			return "/WEB-INF/views/student/add.jsp";
		}
		@PostMapping("/add")
		public String add(@ModelAttribute StudentDto studentDto) {
			studentDao.add(studentDto);
			return "redirect:addFinish";
		}
		@RequestMapping("/addFinish")
		public String addFinish() {
			return "/WEB-INF/views/student/addFinish.jsp";
		}
		
		//수정페이지
		@GetMapping("/edit")
		public String edit(Model model, @RequestParam int studentId) {
			StudentDto studentDto = studentDao.selectOne(studentId);//번호에 대한 메뉴 조회
			if(studentDto == null) {//없는 메뉴면
				return "redirect:editFail";//실패 페이지로 강제이동
			}
			else {//있는 메뉴면
				model.addAttribute("studentDto", studentDto);//JSP로 메뉴정보를 전달
				return "/WEB-INF/views/student/edit.jsp";//수정화면을 연결
			}
		}
		
		@PostMapping("/edit")
		public String change(@ModelAttribute StudentDto studentDto) {
			studentDao.edit(studentDto);
			//return "redirect:changeSuccess";//수정 성공 페이지
			return "redirect:detail?studentId="+studentDto.getStudentId();//상세 페이지
		}
		
		@RequestMapping("/editSuccess")
		public String editSuccess() {
			return "/WEB-INF/views/student/editSuccess.jsp";
		}
		
		@RequestMapping("/editFail")
		public String editFail() {
			return "/WEB-INF/views/student/editFail.jsp";
		}
		
		@RequestMapping("/list")
		public String list(
				@RequestParam(required = false) String column, 
				@RequestParam(required = false) String keyword, 
				Model model) {
			boolean isSearch = column != null && keyword != null;
//			List<StudentDto> list = isSearch ? studentDao.selectList(column, keyword) : studentDao.selectList();
			List<StudentDto> list;
			if(isSearch) {
				list = studentDao.selectList(column, keyword);
			}
			else {
				list = studentDao.selectList();
			}
			
			model.addAttribute("list", list);
			return "/WEB-INF/views/student/list.jsp";
		}
		
		@RequestMapping("/detail")
		public String detail(@RequestParam int StudentId, Model model) {
			StudentDto studentDto = studentDao.selectOne(StudentId);
			model.addAttribute("studentDto", studentDto);
			return "/WEB-INF/views/student/detail.jsp";
		}
		
		
//		@RequestMapping("/delete")
		@GetMapping("/delete")
		public String delete(@RequestParam int StudentId) {
			studentDao.delete(StudentId);
			return "redirect:list";
		}
		
		
		
		
		
		
		
		
		//구분선
//	@RequestMapping("/list")
//	public String list(
//			@RequestParam(required = false) String column,
//			@RequestParam(required = false) String keyword) {
//		boolean isSearch = column != null && keyword != null;
//		List<StudentDto> list = isSearch ? studentDao.selectList(column, keyword) : studentDao.selectList();
//		
//		StringBuffer buffer = new StringBuffer();
//		for(StudentDto dto : list) {
//			buffer.append("[");
//			buffer.append(dto.getStudentId());
//			buffer.append("]");
//			buffer.append(dto.getName());
//			buffer.append(" - ");
//			buffer.append("국어-"+dto.getKoreanScore());
//			buffer.append(",수학-"+dto.getMathScore());
//			buffer.append(",영어-"+dto.getEnglishScore());
//			buffer.append(" (");
//			buffer.append("총점-"+dto.getTotal()+"점 / ");
//			buffer.append("평균-"+dto.getAverage()+"점");
//			buffer.append(")");
//			buffer.append("<br>");
//		}
//		return buffer.toString();
//	}
//	@RequestMapping("/detail")
//	public String detail(@RequestParam int studentId) {
//		StudentDto dto = studentDao.selectOne(studentId);
//		DecimalFormat fmt = new DecimalFormat("#,##0.00");
//		if(dto != null) {
//			StringBuffer buffer = new StringBuffer();
//			buffer.append("학생번호 - " + dto.getStudentId() + "<br>");
//			buffer.append("학생명 - " + dto.getName() + "<br>");
//			buffer.append("국어점수 - " + dto.getKoreanScore() + "점<br>");
//			buffer.append("수학점수 - " + dto.getMathScore() + "점<br>");
//			buffer.append("영어점수 - " + dto.getEnglishScore() + "점<br>");
//			buffer.append("총점 - " + dto.getTotal() + "점<br>");
//			buffer.append("평균 - " + fmt.format(dto.getAverage()) + "점<br>");
//			return buffer.toString();
//		}
//		else {
//			return "존재하지 않는 학생 번호";
//		}
//	}
//
//	@RequestMapping("/delete")
//	public String delete(@RequestParam int studentId) {
//		if(studentDao.delete(studentId)) {
//			return "학생 성적정보 삭제 완료";
//		}
//		else {
//			return "존재하지 않는 학생 번호";
//		}
//	}
}