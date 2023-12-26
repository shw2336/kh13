package hyeongwoo;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		// 사용자에게 입력 받아 객체 생성 및 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("직업(입력하지 않으면 무직으로 설정됩니다.) : ");
		String job = sc.next();

		Person write = new Person(name, age, job);
		write.getName();
		write.getAge();
		write.getJob();
		write.getTest();

		System.out.println("이름 : " + write.getName());
		System.out.println("나이 : " + write.getAge());
		System.out.println("직업 : " + write.getJob());
		System.out.println("나이에 따른 분류 : " + write.getTest());

	}
}