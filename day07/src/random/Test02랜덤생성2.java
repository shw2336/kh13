package random;

import java.util.Random;

public class Test02랜덤생성2 {
	public static void main(String[] args) {
		
		Random r = new Random(); //도구 생성
//		int number = r.nextInt(개수) + 시작 수; <<<공식!!!!
		
//		1.로또 - 1부터 45개
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 = " + lotto);
		
//		2.두 자리 정수 - 10부터 99까지 - 10부터 90개
		int num = r.nextInt(90) + 10;
		System.out.println("두자리정수 = " + num);
		
//		3. 6자리 OTP번호 - 100000부터 999999까지 - 100000 부터 900000개
		int otp = r.nextInt(900000) + 100000;
		System.out.println("OTP번호 = " + otp);
		
//		(주의) 랜덤은 문자열을 만들 수 없다. 그러니까 약속을 한다
//		4.동전 앞/뒤 앞을1로 뒤를 2로 한다고하자 > 1부터 2까지는  -> 0부터 1까지 -> 0부터 2개
		int coin = r.nextInt(2);
		if(coin == 0) {
			System.out.println("동전 = 앞");
		}
		else {
			System.out.println("동전 = 뒤");
		}
//		5.가위바위보 - 가위(0) 바위(1) 보(2) - 0부터 3개
		int rsp = r.nextInt(3);
		switch(rsp) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
		case 2: //이걸 그냥 defalt로 해도 된다.
			System.out.println("보");
		}
	}
}