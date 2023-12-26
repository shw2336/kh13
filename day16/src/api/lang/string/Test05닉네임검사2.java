package api.lang.string;

public class Test05닉네임검사2 {
	public static void main(String[] args) {
//		입력
//		String nickname = "케이에이치123";//정상적인 닉네임
//		String nickname = "케";//글자수 미달
//		String nickname = "학원운영자";//금지단어 포함
		String nickname = "한글123d";//글자규칙 위반

//		계산
		boolean isLengthOk = nickname.length() >= 2 && nickname.length() <= 10;
//		boolean hasForbidden = nickname.contains("운영자");
		boolean hasForbidden = nickname.indexOf("운영자") >= 0;

//		올바른 문자열 형식이란? 글자수 == 한글개수 + 숫자개수
		int koreanCount = 0;
		int numberCount = 0;
		for(int i=0; i < nickname.length(); i++) {//모든 글자를 반복하며
			char ch = nickname.charAt(i);//현재 위치의 글자를 추출
			if('가' <= ch && ch <= '힣') {//한글이라면
				koreanCount++;
			}
			else if('0' <= ch && ch <= '9') {//숫자라면
				numberCount++;
			}
		}
		//System.out.println("한글 개수 = " + koreanCount);
		//System.out.println("숫자 개수 = " + numberCount);
		boolean isCorrectFormat = nickname.length() == koreanCount+numberCount;

		boolean isPass = isLengthOk && !hasForbidden && isCorrectFormat;

//		출력
//		if(닉네임이 운영원칙에 맞으면) {
		if(isPass) {
			System.out.println("멋진 닉네임입니다!");
		}
		else {
			System.out.println("한글 또는 숫자 2~10글자로 작성하세요");
		}

	}
}