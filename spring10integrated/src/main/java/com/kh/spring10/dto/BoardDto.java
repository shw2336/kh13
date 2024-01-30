package com.kh.spring10.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BoardDto {
	private int boardNo;//글번호
	private String boardTitle;//작성자
	private String boardContent;//글내용
	private String boardWriter;//작성자(회원아이디)
	private Date boardWtime;//작성시각
	private Date boardEtime;//편집시각
	private int boardReadcount;//조회수
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardWtime() {
		return boardWtime;
	}
	public void setBoardWtime(Date boardWtime) {
		this.boardWtime = boardWtime;
	}
	public Date getBoardEtime() {
		return boardEtime;
	}
	public void setBoardEtime(Date boardEtime) {
		this.boardEtime = boardEtime;
	}
	public int getBoardReadcount() {
		return boardReadcount;
	}
	public void setBoardReadcount(int boardReadcount) {
		this.boardReadcount = boardReadcount;
	}
	
	public String getBoardWriterStr() {
		if(boardWriter == null)
			return "탈퇴한사용자";
		else
			return boardWriter;
	}
	
	//오늘 작성한 글은 시간을, 이전에 작성한 글은 날짜를 반환
	//- LocalDate 형태로 시간을 변환하여 오늘 날짜와 비교
	//- 날짜가 같다면 LocalDateTime으로 변환해서 시간만 반환
	//- 날짜가 다르다면 LocalDate를 그대로 반환
	public String getBoardWtimeStr() {
		LocalDate today = LocalDate.now();//오늘날짜
		LocalDate wtime = boardWtime.toLocalDate();//작성일자
		if(wtime.equals(today)) {//작성일이 오늘이면
			//Date ---> Timestamp ---> LocalDateTime ---> LocalTime
			Timestamp stamp = new Timestamp(boardWtime.getTime());
			LocalDateTime time = stamp.toLocalDateTime();
			LocalTime result = time.toLocalTime();
			return result.toString();//시간 반환
		}
		else {//작성일이 이전이면
			return wtime.toString();//날짜 반환
		}
	}
}