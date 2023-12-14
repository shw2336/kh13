package array2;

import java.util.Random;

public class Test03로또번호카운트3내가한것 {
	public static void main(String[] args) {
		
//		로또가 아니라 주사위를 1000번 던진다고 가정
//		주사위 내역은 저장의 대상이 아님
		Random r = new Random();
		int[] counts = new int[6];
		// counts ------> [0][0][0][0][0][0] 자연스럽게 0으로 만들어짐 
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		
		for(int i=0; i<10; i++) {
			int number = r.nextInt(6) + 1;
			System.out.println(number);
			
			if(number == 1) {
				//counts[0]	=	//count1++;
			}
			
		}
		
		}
	}
