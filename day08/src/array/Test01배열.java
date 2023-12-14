package array;

public class Test01배열 {
	public static void main(String[] args) {
//		배열
//		같은 종류의 데이터를 여러 개 모아서 저장할 수 있는 저장형태
//		
//		(Q) 숫자 3개를 저장하고 출력하세요
//		(A) 변수 3개를 만들어서 저장 후 출력
		
		int[] arr = new int[] {10, 20, 30};
		
		int b = arr[1] + arr[2];

		System.out.println(arr);
		System.out.println(arr[0]);//리모컨이 쳐다보는 지점에서 +0칸 이동한 곳
		System.out.println(arr[1]);//리모컨이 쳐다보는 지점에서 +1칸 이동한 곳
		System.out.println(arr[2]);//리모컨이 쳐다보는 지점에서 +2칸 이동한 곳
		System.out.println(arr.length);
		
		System.out.println(b);
	}

}
