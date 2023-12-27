package api.lang.string;

public class Test06문자열편집 {
	public static void main(String[] args) {
		//문자열은 불변(immutable)이다.
		//- 편집 명령을 쓰면 무조건 신규 문자열이 나온다
		
		String word = "Hello Java!";
		String upper = word.toUpperCase(); //이렇게 해야 제대로 나온다 // upper에 저장을 한거다 word를 대문자로 바꿔주는걸
		System.out.println("대문자 = " + upper);
		System.out.println("소문자 = " + word.toLowerCase()); //이건 소문자 나오는건데 한번 쓰고 사라지는 거다 저장을 안해뒀으니
				
		//자르기 - substring()
		System.out.println("자르기 = " + word.substring(0, 4)); //보기편하게 커서위치로 확인하면 됨 // 0에서 4까지
		System.out.println("자르기 = " + word.substring(6)); // 6 지점 부터 끝까지(시작지점을 알려주는거)
		
		
		//불필요한 공백제거 - trim(), strip()
		String url = "　　　　　　www.naver.com                   "; //ㄱ누르고 한자키 누르고 1번 띄어쓰기
		System.out.println("여백제거 : " + url.trim()); //아스키코드만 제거(구식명령)
		System.out.println("여백제거 : " + url.strip()); //유니코드도 제거(최신명령) ← 이걸 쓰자!
		
		//문자열 치환
		String text = "나는 피자가 좋아요";
		System.out.println("치환결과는 = " + text.replace("피자", "자바"));
		
		//문자열 분리 - split()
		String[] parts = text.split(" ");
		for(int i=0; i<parts.length; i++) {
			System.out.println("분리 = " + parts[i]);
		}
	}

}
