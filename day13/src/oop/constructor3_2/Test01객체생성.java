package oop.constructor3_2;

import java.util.Scanner;

public class Test01객체생성 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("직업(전사/도적/마법사) : ");
		String job = sc.next();

		Player p = new Player(id, job);

		//레벨업
		//int level = p.getLevel();
		//p.setLevel(level + 1);
		p.levelUp();
		p.information();
	}
}