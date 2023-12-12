package loop3;

public class Test04현명한노인2 {
	public static void main(String[] args) {
		//30일동안 처음에는 1골드만 주시고 그다음 날부터는 전날의 두 배를 주십시오"

		//이 노인이 일자별로 받게되는 골드를 구하여 출력
		//이 노인이 받게되는 총 골드를 구하여 출력
		//30일이 아니라 40일이었다면 얼마를 받는지 구하여 출력
		long count = 1;
		//long step = count * 2;
		long total = 0;
		
		for(long day=1; day<=40; day++) {
			System.out.println(day + "일에 받는 금액은 " + count + "골드" );
			total += count;
			count = count * 2;
	}
		System.out.println("총 골드는 " + total);
	}
}