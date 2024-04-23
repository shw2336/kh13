package com.kh.spring19.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.spring19.service.JwtService;
import com.kh.spring19.vo.MemberLoginVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

//회원만 필터링하는 인터셉터 구현
@Slf4j
@Service
public class MemberInterceptor implements HandlerInterceptor{
    
	@Autowired
	private JwtService jwtService;
	
    @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                throws Exception {
        //클라이언트에서 요청할 때
        //- 로그인한 사용자는 헤더에 Authorization이라는 항목이 존재(통과)
        //        - 헤더의 내용을 읽어 유효한 토큰인 경우(통과)
        //        - 유효하지 않은 토큰인 경우(차단)
        //- 비로그인 사용자는 헤더에 Authorization이라는 항목이 없음(차단)
    		String token = request.getHeader("Authorization");
    		if(token == null) {//헤더가 없으면 비회원이라는 뜻
    			response.sendError(401);
    			return false;
    		}
    	
    		try {
    			//토큰 해석 시도
    			MemberLoginVO loginVO = jwtService.parse(token);
    			log.debug("아이디 = {}, 등급 = {}", loginVO.getMemberId(), loginVO.getMemberLevel());
    			//추가적으로 DB검사, 기타 처리를 추가할 수 있다
    			return true;//통과
    		}
    		catch(Exception e) {
    			//토큰이 유효하지 않는 경우 - 시간만료, 변조, 항목 누락, ....
    			response.sendError(403);
    			return false;//권한 부족해
    		}
        }
}