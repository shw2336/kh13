package loop2;

import java.util.Scanner;

public class Test02나눗셈 {
	public static void main(String[] args) {
		//어떤 숫자가 입력되었을때 이 숫자의 약수 개수를 구하여 출력
		//어떤 숫자가 입력되면 1부터 해당숫자까지 나누어서 떨어지는 숫자의 개수를 구하면 된다.
		//예를들어 5가 입력될경우 5를 1, 2, 3, 4, 5로 나누어 떨어지는지 확인
		//예를들어 6이 입력될 경우 6을 1, 2,3,4,5,6로 나누어 떨어지는지 확인
Scanner sc = new Scanner(System.in);	
		int number = sc.nextInt();
		int count = 0;
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				count ++;
			}
		}
		System.out.println("약수 개수 : " + count + "개");
		if(count == 2) {
			System.out.println("소수 입니다");
		}
		else {
			System.out.println("소수가 아닙니다");
		}
	}
}