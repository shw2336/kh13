package array2;

public class Test05배열뒤집기완성본 {
	public static void main(String[] args) {
		
//		30, 50, 20, 10, 40을 배열에 저장하고 이 배열의 모든 데이터의 위치를 반대로 뒤집은 뒤 출력하세요
		
		//배열 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};
		
		/*
		 위치 교체
		 -데이터의 개수에 따른 교체 규칙을 살펴보자!
		 
		 데이터 1개		교체0번		{30}
		 데이터 2개	교체1번		{30,50}
		 									numbers[0] ↔numbers[1]
		 데이터 3개	교체1번		{30,50,20}
		 									numbers[0] ↔numbers[2]
		 데이터 4개	교체2번		{30,50,20,10}
		 									numbers[0] ↔numbers[3]
		 									numbers[1] ↔numbers[2]
		 데이터 5개	교체2번		{30,50,20,10,40}  		     	//데이터 개수 나누기 2 는 교체하는 횟수
		 									numbers[0] ↔numbers[4]
		 									numbers[1] ↔numbers[3]
		 									
		 데이터 n개 	교체n/2번  numbers[0] ↔numbers[n-1]
		 									numbers[0] ↔numbers[n-2]
		 */
		
		int backup = numbers[0];
		numbers[0] = numbers[4];
		numbers[4] = backup;

		backup = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = backup;
		
		int left = 0;
		//nt right = 
		//for(int)
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			}

		
	}

}
