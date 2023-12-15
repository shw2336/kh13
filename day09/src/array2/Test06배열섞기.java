package array2;

import java.util.Random;

public class Test06배열섞기 {
	public static void main(String[] args) {
		
		/*Test05와 동일한 데이터를 배열에 저장하고 다음 규칙에 따라 데이터를 섞어보세요

		실행할 때마다 다른 위치로 바뀌도록 섞고 싶음
		배열의 모든 자리가 1번은 반드시 바뀌어야함
		바뀌는 자리가 같은 자리여도 상관없음
		모든 자리가 교체된 후 배열을 출력*/
		//
		
		Random r = new Random();
		int[] numbers = new int[] {30, 50, 20, 10, 40};
		
		for(int i=0; i<numbers.length; i++) {
			int random = r.nextInt(numbers.length);
//			System.out.println(random);
			int backup = numbers[i];
			numbers[i] = numbers[random];
			numbers[random] = backup;		
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}