package random;

import java.util.Random;

public class Test01랜덤 {
	public static void main(String[] args) {
//		랜덤(Random)
//		-예측이 불가능한 값
//		-(예) 주사위, 로또, 윷놀이, 가위바위보, 동전던지기, OTP번호 등등
//		-예측은 안되지만 범위는 알 수 있어야 한다.
//		-완벽한 랜덤은 불가능하며, 유사 랜덤 형태의 도구를 제공
//		-도구 이름은 Random
		
		Random r = new Random(); //도구 생성
		
		int a = r.nextInt();
		System.out.println("a = " + a);
		
		//범위를 지정해서 랜덤을 추출할 수 있다
		//(주의) 사람과 자바의 범위 개념이 다르다
		//사람은 주사위 범위를 1부터 6까지라고 생각한다
		//자바는 주사위 범위를 1부터 6개라고 생각한다
		int dice = r.nextInt(6) + 1; // 1은 1부터라는뜻이고 6은 6개 라는 뜻이다.
		System.out.println("주사위 = " + dice);
	}
}