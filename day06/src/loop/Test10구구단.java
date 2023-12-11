package loop;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[] args) {
		//구구단 : (3)
		//3 x 1 = (3)
		//정답!
		//3 x 2 = (5)
		//땡!
	//	3 x 3 = (6)
		//정답!
		//...
		//3 x 9 = (27)
	//	정답!
	//게임 끝!
		
Scanner sc = new Scanner(System.in);		
		int googoodan = sc.nextInt();
		
		for(int i = 1; i<100; i++) {
			int count = i * googoodan;
			
			System.out.println(googoodan * i);
			
			if(googoodan % i == 0) {

				System.out.println(googoodan + "X" + i +"=" + "(" + count + ")");
				System.out.println("정답!");
				}
			else {
				System.out.println(googoodan + "X" + i +"=" + "(" +i+googoodan + ")");
				System.out.println("땡!");
			}
		}
	}
}
