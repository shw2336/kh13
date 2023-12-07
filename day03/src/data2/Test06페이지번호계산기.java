package data2;

public class Test06페이지번호계산기 {
	public static void main(String[] args) {
		
		//홈페이지에 보면 보여줄 내용이 많을 경우 **페이징**이라는 처리를 합니다
		//다 보여주는 것이 아니라 페이지를 나눠서 보여주고 아래이동할 수 있는
		//버튼을 만들어 두는 형태입니다 이를 **페이지 네비게이터** 라고 부릅니다
		//[이전] 1 2 3 4 5 6 7 8 9 10 [다음]
		// 페이지 네비게이터는 다음과 같은 계산 규칙을 가지고 있습니다.
		//-현재 내가 몇 페이지에있느냐에 따라 첫 번호와 마지막 번호가 결정된다
		//- 1페이지부터 10페이지 사이에서는 첫번호가 무조건 1이다
		//- 1페이지부터 10페이지 사이에서는 마지막 번호가 무조건 10이다
		//- 11페이지부터 20페이지 사이에서는 첫번호가 무조건 11이다
		//- 11페이지부터 20페이지 사이에서는 마지막 번호가 무조건 20이다
		//이후에도 계속 페이지가 증가하면 그에 맞는 첫번호와 마지막번호가 계산되어야 한다.
		//275페이지에 위치할 때 첫 번호와 마지막 번호를 출력하세요
		
		
		int page = 275; 
		int scope = 10;
		int pagenumber = (page-1) / scope;
		int left = pagenumber*scope + 1;
		int right = pagenumber*scope + scope; 
		
		//System.out.println(pagenumber);
		//System.out.println(left);
		//System.out.println(right);

		System.out.println( page + "페이지의 첫 번호는" + left + ", 페이지 마지막 번호는" + right + "입니다");
	
	
	
	}
	
}
