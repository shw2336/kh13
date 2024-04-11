<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>Simple 웹소켓 만들어보자</h1>

<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>

<hr>

<!--  누르면 전송되는 버튼을 배치 -->
<button class="btn-word">곱창</button>
<button class="btn-word">치킨</button>
<button class="btn-word">삼겹살</button>
<button class="btn-word">배고파?</button>

<!-- JS 처리 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	//연결 버튼을 누르면 웹소켓 생성, 종료 버튼을 누르면 웹소켓 소멸
	$(".btn-connect").click(function(){
		//var socket = new WebSocket("연결주소");
		window.socket = new WebSocket("ws://localhost:8080/ws/simple");
	});
	$(".btn-disconnect").click(function(){
		window.socket.close();
	});
	
	//단어 버튼을 누르면 서버로 메세지를 전송
	$(".btn-word").click(function(){
		//window.socket.send(메세지);
		var text = $(this).text();//버튼에 써있는 글자를 불러와서
		window.socket.send(text);//서버로 전송!
	});
	
});
</script>