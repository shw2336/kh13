package data;

public class Test03영화관 {
	public static void main(String[] args) {
		
		//입력 - 문제에서 주어진 값들을 변수에 저장
		int adultPrice = 12000;
		int teenagerPrice = 8500;
		int adultCount = 2;
		int teenagerCount = 2;
		
		//계산 
		int adultTotal = adultPrice * adultCount;
		int teenagerTotal = teenagerPrice * teenagerCount;
		int total = adultTotal + teenagerTotal;
		
		//출력 - 문제에서 요구하는 값을 화면에 출력
		//System.out.println(adultTotal);
		//System.out.println(teenagerTotal);
		System.out.println(total);
	}
}
