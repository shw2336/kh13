package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.vo.PageVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	//게시판에서는 empty string으로 전달되는 파라미터를 null로 간주하도록 설정
	//@InitBinder 설정으로 구현
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	

	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
//	@RequestMapping("/list")
//	public String list(
//			@RequestParam(required = false) String column, 
//			@RequestParam(required = false) String keyword,
//			@RequestParam(required = false, defaultValue = "1") int page,
//			@RequestParam(required = false, defaultValue = "10") int size,
//			Model model) {
//		boolean isSearch = column != null && keyword != null;
//		
//		/*
//			화면에 네비게이터를 보여주는 데 필요한 값들을 계산
//			- blockSize : 화면에 표시할 네비게이터 개수 (10으로 설정)
//			- beginBlock : 네비게이터의 처음 숫자 , (페이지-1) / 10 * 10 + 1 (10은 blockSize)
//			- endBlock : 네비게이터의 마지막 숫자 , (페이지-1) / 10 * 10 + 10 (10은 blockSize)
//			- count : 게시글 개수
//			- totalPage : 전체 페이지 개수
//		 */
//		int blockSize = 10;
//		int beginBlock = (page-1) / blockSize * blockSize + 1;
//		int endBlock = (page-1) / blockSize * blockSize + blockSize;
//		model.addAttribute("beginBlock", beginBlock);//네비게이터 시작번호
//		model.addAttribute("endBlock", endBlock);//네비게이터 종료번호
//		model.addAttribute("page", page);//현재 페이지 번호
//		
//		int count = isSearch ? 
//				boardDao.count(column, keyword) : boardDao.count();
//		int totalPage = (count - 1) / size + 1;
//		model.addAttribute("count", count);//게시글 개수
//		model.addAttribute("totalPage", totalPage);//총 페이지 수
//		
//		model.addAttribute("size", size);//현재 게시글 표시 개수
//		
//		if(isSearch) {
//			//model.addAttribute("list", boardDao.selectList(column, keyword));
//			model.addAttribute("list", boardDao.selectListByPaging(column, keyword, page, size));
//		}
//		else {
//			//model.addAttribute("list", boardDao.selectList());
//			model.addAttribute("list", boardDao.selectListByPaging(page, size));
//		}
//		return "/WEB-INF/views/board/list.jsp";
//	}
	
//	Paging 처리를 별도의 VO 클래스로 구현
//	(참고) @ModelAttribute에 옵션을 주면 자동으로 모델에 첨부된다
	@RequestMapping("/list")
	public String list(
			@ModelAttribute PageVO pageVO,
			Model model) {
		//세부 계산은 클래스에서 수행하도록 하고 count, list만 처리
		int count = boardDao.count(pageVO);
		pageVO.setCount(count);
		model.addAttribute("pageVO", pageVO);
		
		List<BoardDto> list = boardDao.selectListByPaging(pageVO);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/board/list2.jsp";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		//조회한 게시글 정보에 있는 회원 아이디로 작성자 정보를 불러와서 첨부
		if(boardDto.getBoardWriter() != null) {//작성자가 탈퇴하지 않았다면
			MemberDto memberDto = memberDao.selectOne(boardDto.getBoardWriter());
			model.addAttribute("memberDto", memberDto);
		}
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	@GetMapping("/write")
	public String write(
			@RequestParam(required = false) Integer boardTarget,
			Model model) {
//		답글일 경우는 작성 페이지로 답글의 정보를 전달(제목 등에 사용)
		if(boardTarget != null) {
			BoardDto targetDto = boardDao.selectOne(boardTarget);
			model.addAttribute("targetDto", targetDto);
		}
		return "/WEB-INF/views/board/write.jsp";
	}
	
//	@PostMapping("/write")
//	public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
//		//세션에서 로그인한 사용자의 ID를 추출
//		String loginId = (String)session.getAttribute("loginId");
//		
//		//아이디를 게시글 정보에 포함시킨다
//		boardDto.setBoardWriter(loginId);
//		
//		int sequence = boardDao.getSequence();//DB에서 시퀀스 번호를 추출
//		boardDto.setBoardNo(sequence);//게시글 정보에 추출한 번호를 포함시킨다
//		boardDao.insert(boardDto);//등록
//		
//		return "redirect:detail?boardNo="+sequence;
//	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
//		새글과 답글을 구분하여 처리
//		- 구분 기준은 boardDto에 boardTarget 유무(있으면 답글, 없으면 새글)
//		- 새글이면 그룹번호=글번호, 대상=null, 차수=0
//		- 답글이면 그룹번호=원본글그룹번호, 대상=원본글번호, 차수=원본글차수+1
		
//		새글이든 답글이든 작성자는 있어야 한다
		String loginId = (String)session.getAttribute("loginId");
		boardDto.setBoardWriter(loginId);
		
//		글번호를 생성하여 설정해준다
		int sequence = boardDao.getSequence();
		boardDto.setBoardNo(sequence);
		
//		새글,답글에 따른 그룹,대상,차수를 계산한다
		if(boardDto.getBoardTarget() == null) {//새글(대상 == null)
			boardDto.setBoardGroup(sequence);//그룹번호는 글번호로 설정
//			boardDto.setBoardTarget(null);//대상은 null로 설정
//			boardDto.setBoardDepth(0);//차수는 0으로 설정
		}
		else {//답글(대상 != null)
			//대상글의 모든 정보를 조회
			BoardDto targetDto = boardDao.selectOne(boardDto.getBoardTarget());
			
			boardDto.setBoardGroup(targetDto.getBoardGroup());//그룹번호를 대상글의 그룹번호로 설정
//			boardDto.setBoardTarget(targetDto.getBoardNo());
			boardDto.setBoardDepth(targetDto.getBoardDepth() + 1);//차수를 대상글의 차수+1 로 설정
		}
		
//		계산이 완료된 정보를 이용하여 새글과 답글 모두 같은 메소드로 등록
		boardDao.insert(boardDto);
		
		return "redirect:detail?boardNo="+sequence;
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boardDao.delete(boardNo);
		//return "redirect:/board/list";
		return "redirect:list";
	}
	
	
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boardDao.update(boardDto);
		return "redirect:detail?boardNo="+boardDto.getBoardNo();
	}
	
}







