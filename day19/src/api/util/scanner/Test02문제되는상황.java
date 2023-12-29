package api.util.scanner;

import java.util.Scanner;

public class Test02문제되는상황 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next(); //단어 입력(띄어쓰기,엔터,탭 등은 건드리지 않는다)
		sc.nextLine(); //남아있는 \n을 정리 입력할때 신형우엔터니까 신형우\n과 같다 그래서 \n을 지울 Line을 만들어줘야함
		
		System.out.print("자기소개 : ");
		String intro = sc.nextLine(); //한줄 입력(엔터를 삭제시켜준다)
//		Line 뒤에 next나 nextInt나 nextDouble등등이 오면 이럴 필요 없다 정리의 문제
//		하지만 next 등등 뒤에 Line이 오면 이렇게 해줘야함
 		sc.close();
		
		System.out.println("이름 : " + name);
		System.out.println("자기소개 : " + intro);
				
	}

}
