package data;

public class Test05삼각김밥 {
	public static void main(String[] args) {
		
		// 입력 - 김밥가격 개수
		int price = 1200;
		int count = 7;
		
		// 원쁠원 투쁠원 김밥의 갯수에 따른 
		// 무료와 유로의 숫자를 막 써봐서 규칙성을 찾아야함 정수니까 소숫점빼고
		// 결국 원쁠원은 나누기2 투쁠원은 나누기3을 하면 된다.
		
		//계산 - 무료든 유로든 한쪽 개수를 구해야함
		int free = count / 2; // 무료가 몇개인지!
		//System.out.println(free);
		int pay = count - free; // 유료 : (갯수에서 무료를 빼면 됨)
		//System.out.println(pay);
		int total = pay * price;
		
		System.out.println(free);
		System.out.println(total);
		
	}

}
