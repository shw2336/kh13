package array2;

public class Test05배열뒤집기 {
	public static void main(String[] args) {
//		30, 50, 20, 10, 40을 배열에 저장하고 이 배열의 모든 데이터의 위치를 반대로 뒤집은 뒤 출력하세요
		
		int[] numbers = new int[] {30, 50, 20, 10, 40};
		int back04 = numbers[0];
		numbers[0] = numbers[4];
		numbers[4] = back04;
		int back13 = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = back13;
		
		int a;
		int b;
		for(int i=0; i<numbers.length-1; i++) {
			if(i < 2/(numbers.length-1)) {
				a = numbers[numbers.length-1-i];
				numbers[numbers.length-1-i] = numbers[i];
				numbers[i] = a;
			}
			System.out.println(numbers[i]);
		}
		System.out.println(numbers[0]);
			
			
			
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
	}

}
