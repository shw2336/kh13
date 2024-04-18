package com.kh.spring19.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dao.EmpDao;
import com.kh.spring19.dto.EmpDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

//문서용 설정 추가
@Tag(name = "사원정보 관리도구", description = "emp 테이블 CRUD 처리")

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmpRestController {
	@Autowired
	private EmpDao empDao;
	
	//문서용 설정 추가
	@Operation(
		description = "사원 목록 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(implementation = EmpDto.class)
						)
					) 
				}
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = {
					@Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				}
			)
		}
	)
	@GetMapping("/")
	public List<EmpDto> list() {
		return empDao.selectList();
	}
	
//	@GetMapping("/{empNo}")
//	public EmpDto find(@PathVariable int empNo) {
//		EmpDto empDto = empDao.selectOne(empNo);
//		return empDto;
//	}
	
//	조회되지 않는 경우(null인 경우)는 404번으로 처리하고 싶다면
	@GetMapping("/{empNo}")
	public ResponseEntity<EmpDto> find(@PathVariable int empNo) {
		EmpDto empDto = empDao.selectOne(empNo);
		if(empDto == null) {
			//return ResponseEntity.notFound().build();
			return ResponseEntity.status(404).build();
		}
		//return ResponseEntity.ok(empDto);
		return ResponseEntity.status(200).body(empDto);
	}
}