package data2;

public class Test03급여계산기 {
	public static void main(String[] args) {
	
	// 급여액이 주어졌을 때 각종 세금과 수령액을 계산하는 계산기를 구현합시다
		// 급여액 : 300만원
		// 국민연금 : 급여액의 4.5%
		// 건강보험료 : 급여액의 7.09%
		// 장기요양보험료 : 건강보험료의 12.81%
		// 고용보험료 : 급여액의 0.9%
//출력순서 - 실수령액 - 국민연금 - 건강보험료 - 장기요양보험료 - 고용보험료
		
		double kmrate = 4.5;
		double kkrate = 7.09;
		double jyrate = 12.81;
		double gyrate = 0.9;
		
		int total = 3000000;
		// 변환연산을 사용하여 double을 int로 바꿔서 저장 (여기서는 이방법이 최고)
		// 또는 int km = total * 45 / 1000; 이것도 가능 근데 1000을 먼저 나누면
		// total이 500원일때는 계산의 오류가 난다
		int km = (int) (total / 100 * kmrate); 
		int kk = (int) (total / 100 * kkrate); 
		int jy = (int) (kk / 100 * jyrate);
		int gy = (int) (total / 100 * gyrate);
		int real = total - km - kk - jy - gy;
				
		System.out.println(real);
		System.out.println(km);
		System.out.println(kk);
		System.out.println(jy);
		System.out.println(gy);

	}
}
