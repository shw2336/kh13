package array;

import java.util.Scanner;

public class Test05배열입력2 {
	public static void main(String[] args) {
//		배열을 만들고 사용자에게 숫자를 5개 입력받아서 저장한 뒤 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];

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