import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		디지털 시계 관련 문제 
Scanner sc = new Scanner(System.in);	
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int c = 60*hour + minute - 45;
		int d = c / 60;
		int e = c % 60;
		
		System.out.println(d + " " + e);
		}
	}