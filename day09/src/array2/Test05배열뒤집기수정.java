package array2;

public class Test05배열뒤집기수정 {
	public static void main(String[] args) {
		
//		30, 50, 20, 10, 40을 배열에 저장하고 이 배열의 모든 데이터의 위치를 반대로 뒤집은 뒤 출력하세요
		
		//배열 준비
		int[] numbers = new int[] {30, 50, 20, 10, 40};
		
		//1.numbers[0]과 numbers[4]를 바꾼다
		//1.numbers[1]과 numbers[3]를 바꾼다
		
		int backup = numbers[0];
		numbers[0] = numbers[4];
		numbers[4] = backup;

		backup = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = backup;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			}

		
	}

}
