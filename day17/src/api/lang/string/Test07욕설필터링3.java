package api.lang.string;

public class Test07욕설필터링3 {
	public static void main(String[] args) {

		//반복문으로 마스킹 처리해보자
		String[] words = new String[] {
			"수박", "조카", "시베리아", "개나리", "신발끈", 
			"지옥", "주옥", "십장생", "십자수", "게불"
		}; 

		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";

		for(int i=0; i < words.length; i++) {
			input = input.replace(words[i], "**");
		}

		System.out.println(input);

	}
}