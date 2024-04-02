package com.kh.spring16;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncryptTest02 {

	@Test
	public void test() {
		//암호화(Encryption) - 대상을 어떤 방식으로 변조하는 것
		//복호화(Decryption) - 변조된 대상을 원래대로 되돌리는 것
		String origin = "hello world";
		int offset = 3;

		StringBuffer buffer = new StringBuffer();
		for(int i=0; i < origin.length(); i++) {
			char ch = origin.charAt(i);
			ch ^= offset;
			buffer.append(ch);
			
		}
		log.debug("원래 문자열 = {}", origin);
		log.debug("암호화 결과 = {}", buffer);
	}
	
}
