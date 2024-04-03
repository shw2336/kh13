package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MimeMessageTest01 {

    @Autowired
    private JavaMailSender sender;

    @Test
    public void test() throws MessagingException {
        //MimeMessage는 여러가지 옵션을 설정할 수 있는 메세지

        //메세지 객체 생성
        MimeMessage message = sender.createMimeMessage();

        //도우미 객체 생성 - 파일전송은 안하고 UTF-8로 변환해서 전송하겠다
        MimeMessageHelper helper = new MimeMessageHelper(message, false, "UTF-8");

        //헬퍼에 정보를 설정
        helper.setTo(new String[] {"shw2336@naver.com", "shw2336@gmail.com"});
        helper.setSubject("오늘의 운세");
        helper.setText("<h1>안알랴쥼</h1>", true);

        StringBuffer buffer = new StringBuffer();
        buffer.append("<div style='padding:20px; border:1px solid black'>");
        buffer.append("<h1>당신의 오늘의운세</h1>");
        buffer.append("<br>");
        buffer.append("<p>");
        buffer.append("응 안알려줘 ^^");
        buffer.append("<br>");
        buffer.append("킹받쥬? ㅋ");
        buffer.append("</p>");
        buffer.append("</div>");
        
        helper.setText(buffer.toString(), true);
        
        
        //전송
        sender.send(message);
        

    }
}