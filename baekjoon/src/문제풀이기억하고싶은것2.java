import java.util.Scanner;

public class 문제풀이기억하고싶은것2 {
	public static void main(String[] args) {
		
//https://www.acmicpc.net/problem/10871 문제 풀다가 대기중
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = sc.nextInt();
		int[] b = new int[c];
		//int[] b = new int[c] {d};
		
		for (int i = 0; i < b.length; i++) {
			if (b[a] > b[i]) {
				System.out.println(b[i]);
			}
		}
		System.out.println("\\");

		}
	}
