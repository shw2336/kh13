package loop;

public class Test07삼육구박수 {
	public  static void main(String[] args) {
		//1부터 99사이의 숫자 중 369게임상에서
		//박수를 쳐야하는 숫자들만 골라서 출력
		// 3 6 9 13 16 19 23 26 29 33 36 39
		
		for(int i=1; i<=99; i=i+1) { 
			if((i%10 == 3 || i%10 == 6 || i%10 == 9) && (i/10 == 3 || i/10 == 6 || i/10 == 9)) {
				System.out.print("박수2" + "  ");
			}
			
			else if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i/10 == 3 || i/10 == 6 || i/10 == 9) {
			System.out.print("박수" + "  ");
			}
			
			else{
			System.out.print(i);}
		}
	}
}
