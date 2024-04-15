package com.kh.spring18.vo.room;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class RoomVO {
	//채팅방은 중복없이 여러명 보유할 수 있다
	private Set<UserVO> users = new CopyOnWriteArraySet<>();
	
	//방에 대한 여러가지 기능들을 메소드로 구현
	//- 입장, 퇴장, 검색, 메세지 전송, ...
}
