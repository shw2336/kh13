package random;

import java.util.Random;

public class Test02랜덤생성 {
	public static void main(String[] args) {
//		로또번호 1개를 추첨한 결과
//		두자리 정수 중 한 개를 추첨한 결과
//		6자리 OTP번호 한 개를 생성한 결과
//		동전의 앞/뒤 중 하나를 생성한 결과
//		가위/바위/보 중 하나를 생성한 결과
		Random r = new Random();
		
		int a = r.nextInt(45) + 1;
		int b = r.nextInt(45) + 1;
		int c = r.nextInt(45) + 1;
		int d = r.nextInt(45) + 1;
		int e = r.nextInt(45) + 1;
		int f = r.nextInt(45) + 1;
		System.out.println(a+"," + b+"," +c+"," +d+"," +e+"," +f);
		int g = r.nextInt(99) + 10;
		System.out.println(g);
		int h = r.nextInt(999999)+100000;
		System.out.println(h);
		int k = r.nextInt(2) + 1;
		if(k==1) {		System.out.println("앞");
		}
		else {		System.out.println("뒤");
			
		}
	}
}