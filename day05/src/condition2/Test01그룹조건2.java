package condition2;

public class Test01그룹조건2 {
	public static void main(String[] args) {
		// 남은 시간(분)에 따라 학원에 어떻게 올 지 결정하는 프로그램
		// - 버스를 타면 2시간이 걸리지만 앉아서 편하게 올 수 있다
		// - 지하철을 타면 1시간이 걸리지만 매우 불편하게 온다
		// - 택시를 타면 30분이 걸리지만 돈이 비쌈
		// 우선순위
		// (1) 버스 (2) 지하철 (3) 택시 (4) 죄송...

		int minute = 40;
		
		if(minute >= 120) {//지하철을 탈 수 있는 상황이라면 //가장 우선시되는 조건을 위에!
			System.out.println("지하철을 타고 학원에 갑니다");
		}
		else if(minute >= 60) {//버스를 탈 수 있는 상황이라면
			System.out.println("버스를 타고 학원에 갑니다");
		}
		else if(minute >= 30) {//택시를 탈 수 있는 상황이라면
			System.out.println("택시를 타고 학원에 갑니다");
		}
		else {
			System.out.println("강사님에게 전화를 합니다");
		}
	}
}