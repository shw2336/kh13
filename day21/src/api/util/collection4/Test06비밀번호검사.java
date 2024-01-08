package api.util.collection4;

public class Test06비밀번호검사 {
	public static void main(String[] args) {
		//(Q) 정규표현식으로 반드시 한개 이상 포함이라는 것을 검사할 수 있는가?
		//(ex) 비밀번호 - 대문자/소문자/숫자/특수문자 반드시 1개이상 포함
		
		String email = "shw2336@nvaer.com";
		
		//String regex = "^[A-Za-z0-9!@#$]{8,16}$";//반드시 1개 미구현
		//String regex = "^(?=(.*?)[A-Z]+)[A-Za-z0-9!@#$]{8,16}$";//대문자 반드시 포함
		String regex = "^(?=(.*?)[A-Z]+)(?=(.*?)[a-z]+)(?=(.*?)[0-9]+)(?=(.*?)[!@#$]+)[A-Za-z0-9!@#$]{8,16}$";//대문자,소문자,숫자,!@#$ 중 하나 반드시 포함
		
		System.out.println(email.matches(regex));
	}
}