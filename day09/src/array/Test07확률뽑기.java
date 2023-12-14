package array;

import java.util.Random;
import java.util.Scanner;

public class Test07확률뽑기 {
	public static void main(String[] args) {
//		다음과 같은 아이템 추첨 확률이 주어졌을 때, 실행하면 확률에 맞게 무작위로 하나의 항목이 추첨되도록 구현
//		금빛 상자 : 10%
//		은빛 상자 : 20%
//		철 상자 : 70%
		Random r = new Random();
		
		String[] room = new String[] {"금빛상자", "은빛상자","철 상자"};
		
			int box = r.nextInt(10);
			
			if(box == 0) {
				System.out.println(room[0]);
			}
			else if(box == 1 || box == 2) {
					System.out.println(room[1]);
			 }
			else {
					System.out.println(room[2]);
			}
	}
}
