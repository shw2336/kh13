package data;

public class Test02분식집 {
	public static void main(String[] args) {
		
		System.out.println(18000); // [1]
		
		System.out.println(3500*4 + 2000*2); // [2]
		
		//System.out.println(3500*4); //[3]
		//System.out.println(2000*2);
		//System.out.println((3500*4)+(2000*2));
		
		//int a = 3500 * 4;
		//int b = 2000 * 2;
		//System.out.println(a+b);
		
		//int c = 3500;
		//int d = 2000;
		//System.out.println(4*c + 2*d);
		
		//모든 수치를 변수로 관리하여 계산 및 출력해야한다(최종)
		
		int ddeokboki = 3500; 
		int fried = 2000; 
		int ddeokbokiCount = 4; 
		int friedCount = 2; //여기까지 프로그램의 입력 시작
		
		int ddeokbokiTotal = ddeokboki * ddeokbokiCount;
		int friedTotal = fried * friedCount;
		int total = ddeokbokiTotal + friedTotal; //가운데는 계산
		
		System.out.println(ddeokbokiTotal);
		System.out.println(friedTotal);
		System.out.println(total); //끝은 출력 (이렇게 세 단계로 구분)
		
		
	}
}