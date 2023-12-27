package api.lang.string;

public class Test07욕설필터링5 {
	public static void main(String[] args) {

		//단어의 글자수를 지켜가면서 마스킹 처리하도록 업그레이드 해보자
		String[] words = new String[] {
			"수박", "조카", "시베리아", "개나리", "신발끈", 
			"지옥", "주옥", "십장생", "십자수", "게불"
		}; 

		String input = "이런 수박씨 신발끈같은 개나리 십장생 십자수를 보았나";

		String[] star = new String[] {
			"",//star[0]
			"*",//star[1]
			"**",//star[2]
			"***",//star[3]
			"****",//star[4]
			"*****",//star[5]
			"******",//star[6]
			"*******",//star[7]
			"********",//star[8]
			"*********",//star[9]
			"**********"//star[10]
		};

		for(int i=0; i < words.length; i++) {
			int size = words[i].length();//글자수 확인
			input = input.replace(words[i], star[size]);
		}

		System.out.println(input);

	}
}