package 연습;

public class Practice2 {
	public static void main(String[] args) {

		//배열 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};

		//선택 정렬(selection sort) - 최소값을 앞에서부터 채우는 방식
		for(int k=0; k <= 3; k++) {
			int min = k;
			for(int i=k+1; i <= 4; i++) {//마지막까지
				if(numbers[min] > numbers[i]) {
					min = i;
				}
			}

			int backup = numbers[k];
			numbers[k] = numbers[min];
			numbers[min] = backup;
		}


		//출력
		for(int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}