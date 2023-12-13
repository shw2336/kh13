package loop3;

import java.util.Random;

public class Test03합계구하기 {
	public static void main(String[] args) {
//		사용자가 '0'을 입력하기 전까지 입력한 숫자들의 합계와 평균을 구하여 출력
		
		Random r = new Random();
		int num = 0;
		int all = 0;
		while(true) {
			int write = r.nextInt(99);
			num++;
			System.out.println("사용자의 입력 : " + write);
			if(write == 0) {
				break;
			}
			else {
				all += write;
			}
			System.out.println("개수 : " + num);
			System.out.println("총 : " + all);
		}
		double average = (double)all / num;
		System.out.println(average);
		//double average = (double) / num;
		//System.out.println("합계 = " + );
		//System.out.println("평균 = " + num / );
		
	}
}
