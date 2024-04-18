package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "학생 정보 객체")//springdoc에 추가되는 설명
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class StudentDto {

	private int studentId;
	private String name;
	private int koreanScore;
	private int mathScore;
	private int englishScore;
}
