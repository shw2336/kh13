package api.util.scanner;

import java.util.Scanner;

public class Test03Scanner부가기능 {
	public static void main(String[] args) {
		String colors = "빨강+주황/노랑-초록=파랑*남색_보라";
		
		//빼야하는거 알려주는!!!!!!!!!
		
		Scanner sc = new Scanner(colors);
		
	//	sc.useDelimiter("\\+"); //+가 구분자임을 알려준다
			sc.useDelimiter("[^가-힣]"); //한글이 아니면 구분자임을 알려준다
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
		
	}

}
