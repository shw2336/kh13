package array2;

public class Test01최대값찾기 {
	public static void main(String[] args) {
		
//		(Q) 가장 큰 데이터는 어디있어요?
//		(A) 1번 위치
		
		int[] numbers = new int[] {30, 50, 20, 10, 60};
		
		int max = 0;//0을 가장 큰 위치라고 가정 //위의 예시중에서는 30을 가장 큰 위치라고 가정 그다음 오른쪽으로 점점 비교
		for(int i=1; i<=numbers.length; i++) {//1부터 마지막까지 반복하며
//			numbers[max] - 현재 내가 알고 있는 가장 큰 값
//			numbers[i] - 현재 비교할 대상의 값
			if(numbers[max] < numbers[i]) {
				max = i; //위치를 갱신
			}
		}
		System.out.println("max = " + max);
		System.out.println("value = " + numbers[max]);
	}
}