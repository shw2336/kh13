package com.kh.spring19;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring19.configuration.JwtProperties;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class JwtTest03 {

	@Autowired
	private JwtProperties jwtProperties;
	
	@Test
	public void test() {
		//생성된 토큰 정보
		//String token = ""
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJLSGFjYWRlbXkiLCJpYXQiOjE3MTM4NjAwNzYsImV4cCI6MTcxMzg4MTY3NiwibG9naW5JZCI6InRlc3R1c2VyMSIsImxvZ2luTGV2ZWwiOiLsnbzrsJjtmozsm5AifQ.Vd9GVM2-wvd60SVUleUlM5BloVh-UZYSj5yuE47K8c4";
		
		//1. 해석을 위한 key 생성
		String keyStr = jwtProperties.getKeyStr();
		SecretKey key = Keys.hmacShaKeyFor(keyStr.getBytes(StandardCharsets.UTF_8));
		
		//2. 토큰 해석 - 목적은 Claim을 읽어내는것
		Claims claims = (Claims) Jwts.parser()//해석도구(parser)준비해서
					.verifyWith(key)//열쇠설정하고
					.requireIssuer(jwtProperties.getIssuer())//발행자 정보를 확인하도록
					.build()//만든다음
					.parse(token)//토큰 해석하고
					.getPayload();//내용 가져와!
		
		
		//3. 정보 출력
		log.debug("loginId = {}", claims.get("loginId"));
		log.debug("loginLevel = {}", claims.get("loginLevel"));
		log.debug("test = {}", claims.get("test"));
	}
	
}