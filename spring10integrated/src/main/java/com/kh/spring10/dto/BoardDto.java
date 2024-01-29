package com.kh.spring10.dto;

public class BoardDto {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String boardWtime;
	private String boardEtime;
	private int boardReadcount;
	
	public BoardDto() {
		super();
	}
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
	public String getBoardWtime() {
		return boardWtime;
	}
	public void setBoardWtime(String boardWtime) {
		this.boardWtime = boardWtime;
	}
	public String getBoardEtime() {
		return boardEtime;
	}
	public void setBoardEtime(String boardEtime) {
		this.boardEtime = boardEtime;
	}
	public int getBoardReadcount() {
		return boardReadcount;
	}
	public void setBoardReadcount(int boardReadcount) {
		this.boardReadcount = boardReadcount;
	}

	
	
}
