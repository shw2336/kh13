import java.util.Scanner;

public class 문제풀이기억하고싶은것 {
	//기억남는 문제
	//1부터 n까지의 합 구하는 공식
	//	ex) n = 8 이면 1+2+3+4+5+6+7+8=?
	//	ex) n = 9 이면 1+2+3+4+5+6+7+8+9=?
	//	ex) n = 4 이면 1+2+3+4=?
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		
		int a = 0;

		for(int i=1; i<=n; i++) {
			a= a+i; //== a += i			
		}
		System.out.println(a);
	}
}