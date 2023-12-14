package array;

import java.util.Scanner;

public class Test05배열입력3완성형 {
	public static void main(String[] args) {
//		배열을 만들고 사용자에게 숫자를 5개 입력받아서 저장한 뒤 출력
		
		Scanner sc = new Scanner(System.in);
		
		//int[] numbers = new int[] { 10, 20, 30, 40, 50};
		int[] numbers = new int[2]; //데이터가 정해지지 않은 경우(데이터의 개수를 써주는것)
		// numbers -----	[0][0][0][0][0] > 처음 만들면(new int) 깨끗하다! 0으로 출력이 됨
		// numbers = 10; 이건 안된다 // 마찬가지로 numbers = sc.nextInt(); 이건 안된다
		// numbers[0] = 10; 이렇게 해야 된다! // 마찬가지로 numbers[0] = sc.nextInt(); 이건 된다!
		
		System.out.println("숫자 5개를 입력하세요 : ");
		for(int i=0; i<numbers.length; i++) {//
			System.out.print("숫자 :");
			numbers[i] = sc.nextInt();
		}
		for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
		}
	}
}