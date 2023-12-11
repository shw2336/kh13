package loop;

public class Test07삼육구2 {
	public  static void main(String[] args) {
		//1부터 99사이의 숫자 중 369게임상에서
		//박수를 쳐야하는 숫자들만 골라서 출력
		// 3 6 9 13 16 19 23 26 29 33 36 39
		
		
		for(int i=1; i<=99; i=i+1) {
			int ten = i / 10; // 10의 자리 추출
			int one = i % 10; // 1의 자리 추출
		
			//boolean has369 = 십의자리에 3,6,9 또는 일의자리에 3,6,9;
			boolean has3 = ten == 3 || one ==3;
			boolean has6 = ten == 6 || one ==6;
			boolean has9 = ten == 9 || one ==9;
			boolean has369 = has3 || has6 || has9;
			
			if(has369) {
				System.out.print("박수");
			}
			else {
				System.out.print(i);
			}
		}
	}
}