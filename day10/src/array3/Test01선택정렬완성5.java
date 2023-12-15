package array3;

public class Test01선택정렬완성5 {
	public static void main(String[] args) {

		int[] numbers = new int[] { 50, 30, 20, 10, 40 };

		for (int k = 0; k < numbers.length - 2; k++) {

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {

					int backup = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = backup;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		/*
		 * for(int i=2; i<=2; i++) { if(numbers[b+1] > numbers[i]) { i = b+1; } }
		 * 
		 * for(int i=3; i<=3; i++) { if(numbers[b+2] > numbers[i]) { i = b+2; } }
		 * 
		 * for(int i=4; i<=4; i++) { if(numbers[b+3] > numbers[i]) { i = b+3; } }
		 */
	}
}