package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.PocketmonDao;
import com.kh.spring19.dto.PocketmonDto;

@CrossOrigin
@RestController
@RequestMapping("/pocketmon")
public class PocketmonRestController {
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	@GetMapping("/")//조회
	public List<PocketmonDto> list() {
		return pocketmonDao.selectList();
	}
	
	@PostMapping("/")//등록
	//public void insert(@ModelAttribute PocketmonDto pocketmonDto) {//Form Data(ex : <form> 또는 jQuery)
	public void insert(@RequestBody PocketmonDto pocketmonDto) {//JSON(ex : axios 또는 fetch api)
		pocketmonDao.insert(pocketmonDto);
	}
	
	@PutMapping("/")//전체수정
	public boolean editAll(@RequestBody PocketmonDto pocketmonDto) {//json
		boolean result = pocketmonDao.update(pocketmonDto);
		return result;
	}
	
	@PatchMapping("/")//일부수정
	public boolean editUnit(@RequestBody PocketmonDto pocketmonDto) {//json
		boolean result = pocketmonDao.update(pocketmonDto);
		return result;
	}
	
	//삭제는 반드시 한 개만 해야 한다
	//- PK에 대한 정보가 필요한데 이를 주소에서 읽어올 수 있도록 처리
	//- 이러한 방식을 경로변수(Path Variable)이라고 부른다
	//- @PathVariable 로 경로변수를 읽을 수 있다
	//- 한 개의 데이터를 넘길 때 매우 유용하게 사용
	@DeleteMapping("/{pocketmonNo}")
	public boolean delete(@PathVariable int pocketmonNo) {
		return pocketmonDao.delete(pocketmonNo);
	}
	
	//상세조회
	//- 과거에는 detail?pocketmonNo=5와 같이 구현했었다(파라미터 방식)
	//- ? 뒷부분은 주소라고 보지 않기 때문에 지금 구조에 적합하지 않다
	//- 경로변수로 대체하여 사용
	@GetMapping("/{pocketmonNo}")
	public PocketmonDto find(@PathVariable int pocketmonNo) {
		PocketmonDto pocketmonDto = pocketmonDao.selectOne(pocketmonNo);
		return pocketmonDto;
	}
	
}