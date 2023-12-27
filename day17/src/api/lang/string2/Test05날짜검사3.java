package api.lang.string2;

public class Test05날짜검사3 {
	public static void main(String[] args) {
		String birth = "2021-02-29";

		//윤년 계산은 프로그래밍 코드로 진행
		int year = 2021;
		boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

		//윤년인지 여부에 따라 검사식의 마지막 날짜를 구해서 적용
		int number;
		if(isLeap) {
			number = 9;
		}
		else {
			number = 8;
		}

		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-"+number+"])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$";

		if(birth.matches(regex)) {
			System.out.println("생년월일 설정 완료");
		}
		else {
			System.out.println("잘못된 날짜 형식입니다");
		}
	}
}