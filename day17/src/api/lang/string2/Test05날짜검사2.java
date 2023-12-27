package api.lang.string2;

public class Test05날짜검사2 {
	public static void main(String[] args) {
		String birth = "2000-06-31";

		//String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$";

		if(birth.matches(regex)) {
			System.out.println("생년월일 설정 완료");
		}
		else {
			System.out.println("잘못된 날짜 형식입니다");
		}
	}
}