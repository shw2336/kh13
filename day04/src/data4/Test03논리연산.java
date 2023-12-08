package data4;

public class Test03논리연산 {
	public static void main(String[] args) {
		//논리 연산
		//- 논리끼리 계산할때 사용
		//- &&(and), ||(or) 을 이용하여 조합
		
		//(ex) 19살은 청소년인가요?
		//- 청소년은 14살부터 19살까지입니다
		
		int age = 5;
		//boolean teen  = 14 <= age <=19; // 안됨
		boolean teen = 14 <= age && age <= 19;  // 이렇게 바꿔써줘야 하는것
		System.out.println("age는 청소년인가요?" + teen);
		
		//- 무임승차 대상은 65세 이상 또는 8세 미만입니다
		boolean free = age >= 65 || age < 8;
		System.out.println("무임승차 대상인가요?" + free);
	}
}
