package condition2;

import java.util.Scanner;

public class Test04체질량계산기 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 :  ");
		double cm = sc.nextDouble();
		System.out.print("체중을 입력하세요 :  ");
		double kg = sc.nextDouble();
		
		double m = cm / 100;
		double bmi = kg / (m * m);

		if (bmi < 18.5) {
			System.out.println("저체중입니다"); 
		}
		else if(bmi >= 18.5 && 23 > bmi) {
			System.out.println("정상"); 
		}
		else if(bmi >= 23 && 25 > bmi) {
			System.out.println("과체중"); 
		}
		else if(bmi >= 25 && 30 > bmi) {
			System.out.println("경도비만"); 
		}
		else {
			System.out.println("중등도비만"); 
		}
	}
}
