package com.kh.spring18.websocket;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SimpleWebSocketServer extends TextWebSocketHandler {
	/*
	 * 사용자가 웹소켓 서버에 접속하면 자동 실행되는 메소드
	 */
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		log.debug("사용자가 접속했습니다");
		log.debug("session = {}", session);
		
		//session을 이용하면 사용자에게 메세지를 보낼 수 있다
		
		//TextMessage message = new TextMessage("어서오세요!");
		TextMessage message = new TextMessage(LocalDateTime.now().toString());
		session.sendMessage(message);
	}
	
	/*
	 * 사용자가 웹소켓 서버에서 접속 종료하면 자동 실행되는 메소드
	 * - WebSocketSession - 접속 종료한 웹소켓 사용자의 정보(HttpSession과 다름)
	 * - CloseStatus - 종료를 어떻게 했는지에 대한 정보
	 */
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		log.debug("사용자가 접속을 종료했습니다");
		log.debug("session = {}", session);
		
		//사용자가 나간 뒤에 메세지를 보낼 수 있을까? 절대 불가!
	}
	
	/*
	 * 사용자가 웹소켓 서버에 메세지를 보내면 실행되는 메소드
	 * - WebSocketSession - 메세지를 보낸 사용자 정보(HttpSession과 다름)
	 * - TextMessage - 사용자가 보낸 메세지 객체
	 */
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		log.debug("사용자가 메세지를 보냈습니다");
		log.debug("message = {}", message);
		log.debug("message = {}", message.getPayload());
		
		switch (message.getPayload()) {
		case "곱창":
			session.sendMessage(new TextMessage("존맛탱"));
			break;
		case "치킨":
			session.sendMessage(new TextMessage("넘 맛있어ㅠㅠ"));
			break;
		case "삼겹살":
			session.sendMessage(new TextMessage("먹으러 갈 사람?"));
			break;
		default:
			session.sendMessage(new TextMessage("배불러!"));
			break;
		}
	}
}
