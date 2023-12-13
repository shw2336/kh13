package array;

public class Test04배열계산2 {
	public static void main(String[] args) {
//		다음과 같은 학생 성적 정보가 있을 때 이를 배열에 저장하고 계산하여 출력
//		90, 67, 75, 88, 52, 59, 90, 92, 61, 72

//		불합격자(60점 미만) 점수만 출력
//		성적우수자(90점 이상) 점수만 출력
//		총점과 전체 평균을 출력
//		만약 80점인 학생이 전학을 온다면 예상되는 등수를 출력
		
		int[] a = new int[] {90, 67, 75, 88, 52, 59, 90, 92, 61, 72};
		int total = 0; //총점
		//average = 0; //평균
		int count = 1;
		
		System.out.print("불합격자 점수는 : ");
		for(int i=0; i<a.length; i++) {
			total += a[i];
			if(a[i]<60) {
				System.out.print(a[i] + "  ");
			}
			if(a[i]>80) {
				count ++;
			}
			}
		System.out.println();
		System.out.print("성적우수자 점수는 : ");
		for(int i=0; i<a.length; i++) {
			if(a[i]>=90) {
				System.out.print(a[i] + "  ");	
			}
		}
		double average = (double)total / a.length;
		System.out.println();
		System.out.println("총점은" + total + "입니다");
		System.out.println("전체 평균은" + average + "입니다");
		System.out.println((count) +  "등입니다");
	}
}