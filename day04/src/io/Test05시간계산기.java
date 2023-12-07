package io;

import java.util.Scanner;

public class Test05시간계산기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입실시각 입력 : ");
		int in = sc.nextInt();
		System.out.print("퇴실시각 입력 : ");
		int out = sc.nextInt();
		
		int time = out - in;
		int hour = time / 100;
		int minute = time % 100;
		System.out.println(); //띄어쓰기!
		System.out.print("수업에 참여한 시간은 총 " + hour + "시간 " + minute + "분 입니다.");
		
		
		
		
		
	}

}
