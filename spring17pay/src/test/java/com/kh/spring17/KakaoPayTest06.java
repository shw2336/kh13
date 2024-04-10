package com.kh.spring17;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class KakaoPayTest06 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		//데이터 준비 - KakaoPayApproveRequestVO
		KakaoPayApproveRequestVO requestVO = 
				KakaoPayApproveRequestVO.builder()
					.tid("T60e324e4510678bc604")
					.partnerOrderId("4f9c2bcf-77b3-4697-a0c2-e92a8f02a0ac")
					.partnerUserId("testuser1")
					.pgToken("254fa1098148e85ad521")
				.build();
		
		//처리
		KakaoPayApproveResponseVO responseVO = 
											kakaoPayService.approve(requestVO);
		
		//결과 출력 - KakaoPayApproveResponseVO
		log.debug("responseVO = {}", responseVO);
	}
	
}