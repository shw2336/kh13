package api.lang.string;

public class Test07욕설필터링4 {
	public static void main(String[] args) {

		//단어의 글자수를 지켜가면서 마스킹 처리하도록 업그레이드 해보자
		String[] words = new String[] {
			"수박", "조카", "시베리아", "개나리", "신발끈", 
			"지옥", "주옥", "십장생", "십자수", "게불"
		}; 

		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";

		String star = "*";

		for(int i=0; i < words.length; i++) {
			//input = input.replace(words[i], "**");
			//input = input.replace(words[i], star.repeat(2));
			int size = words[i].length();//글자수 확인
			input = input.replace(words[i], star.repeat(size));//글자수만큼 별 반복(Java 11+)
		}

		System.out.println(input);

	}
}