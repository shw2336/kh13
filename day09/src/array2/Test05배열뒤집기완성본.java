package array2;

public class Test05배열뒤집기완성본 {
	public static void main(String[] args) {

		//배열 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};

		/*
		
		위치 교체
		- 데이터의 개수에 따른 교체 규칙을 살펴보자!
		
		데이터 1개 		교체0번			{30}
		데이터 2개		교체1번			{30,50}
												numbers[0] ↔ numbers[1]
		데이터 3개		교체1번			{30,50,20}
												numbers[0] ↔ numbers[2]
		데이터 4개		교체2번			{30,50,20,10}
												numbers[0] ↔ numbers[3]
												numbers[1] ↔ numbers[2]
		데이터 5개		교체2번			{30,50,20,10,40}
												numbers[0] ↔ numbers[4]
												numbers[1] ↔ numbers[3]
		
		데이터 n개		교체 n/2번		numbers[0] ↔ numbers[n-1]
												numbers[1] ↔ numbers[n-2]
												...
		*/

		int left = 0;//처음 위치
		int right = numbers.length-1;//마지막 위치
//		for(int i=0; i < numbers.length/2; i++) {
		for(int i=1; i <= numbers.length/2; i++) {//데이터 개수 절반만큼 반복
			//left위치와 right위치를 바꾸면된다
			int backup = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = backup;

			//다음 턴을 위해서 left는 1증가, right는 1감소 처리
			left++;
			right--;
		}

		//출력
		for(int i=0; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
	}
}