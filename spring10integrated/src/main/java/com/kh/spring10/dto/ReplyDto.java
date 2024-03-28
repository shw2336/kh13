package com.kh.spring10.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ReplyDto {
	private int replyNo;
	private String replyContent;
	private String replyTime;
	private String replyWriter;
	private int replyOrigin;
}