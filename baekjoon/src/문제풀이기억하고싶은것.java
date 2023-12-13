import java.util.Scanner;

public class 문제풀이기억하고싶은것 {
	public static void main(String[] args) {
//		디지털 시계 관련 문제 
Scanner sc = new Scanner(System.in);	
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int addtime = sc.nextInt();
		
		int resulthour = (hour*60 + minute + addtime) / 60 % 24; // 이게 미쳤따 / 60 % 24 하면 디지털 시계 시간 표현 가능!
		int resultminute = (hour*60 + minute + addtime) % 60;
		
		System.out.println(resulthour + " " + resultminute);
		
		}
	}
