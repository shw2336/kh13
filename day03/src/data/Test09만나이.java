package data;

public class Test09만나이 {
	public static void main(String[] args) {
		
// 오늘은 2023년 12월 6일입니다
// 2000년 1월 1일 생의 만나이를 구하여 출력하세요
// 단, 생년월일은 '20231206'처럼 8자리의 숫자형태로 제공됩니다
	// 단, 일은 고려하지 않고 월까지만 고려합니다.
	//ex) 2023
	// 만 나이 : 12개월마다 1살 
	
	int current = 20231206;
	int birth = 20000101;
	int age = current - birth;
	//System.out.println(current - birth);
	int month = (age / 100 % 100);
	//System.out.println (month);
	int yearTmonth = (age / 10000 * 12);
	//System.out.println (yearTmonth);
	
	int totalmonth = yearTmonth + month;
	//System.out.println (totalmonth);
	
	int totalage = totalmonth / 12;
	System.out.println (totalage);

	}	
}
