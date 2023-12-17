package 연습;

public class Practice3 {
	public static void main(String[] args) {

		int[] numbers = new int[] { 30, 50, 20, 10, 40 };

			int min=0;
			for(int i=1; i<numbers.length; i++) {
				if(numbers[min] > numbers[i]) {
					min = i;
				}
			}
			//연습 하나가 둘 둘이 셋
			int backup = numbers[0];
			numbers[0] = numbers[min];
			numbers[min] = backup;
			
			for(int i=0; i<numbers.length; i++) {
				System.out.println(numbers[i]);
				
			}
	}
}