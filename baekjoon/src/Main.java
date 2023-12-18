import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = new int[9];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int same = 0;
		int max = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[max] < A[i]) {
				max = i;
				same = i;
			}
		}

		System.out.println(A[max]);
		System.out.println(same + 1 );
	}
}