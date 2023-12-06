package data2;

public class Test01실수 {
	public static void main(String[] args) {
		//실수
		//-소수점이 있는 숫자
		//-손해가 좀 발생하더라도 경량 형태로 저장하도록 구성
		//-float, double이 있으며 double이 기본 형태
		
		double a = 123.4567;
		System.out.println(a);
		
		float b = 123.4567f;
		System.out.println(b);
		
		// 소수점이 엄청짧을때만 float 좀 길면 double
		// 대부분 double로 한다.
		
		//-실수가 하나라도 포함된 계산은 결과가 실수 
		//ex) 1+1+1+1+1+1+1+1.0 = 8.0
		int s1 = 50;
		int s2 = 55;
		int s3 = (s1 + s2) / 2;
		System.out.println(s3);
		
		// 50과 55의 평균값을 구할때!
		double s4 = (s1 + s2) / 2.0;     //실수를 하나라도 포함해야하기때문에
		System.out.println(s4);            // 2가 아니라 2.0을 나눈다 대박
		// 그래야 결과가 52.5가 나온다 만약 2로 나누면 정수처리 되어서
		// 결과가 52로 나온다 소수점이 사라짐 
		
	}
}
