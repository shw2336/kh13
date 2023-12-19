package oop.modifier1_1;

public class Test01 {
	public static void main(String[] args) {
		Book a = new Book();
		
		a.data("마흔에 읽는 쇼펜하우어", "강용수", 15300, 850);
		
		a.setPage(-900);
		
		a.information();
		
		Book b = new Book();
		b.data("트렌드 코리아 2024", "김난도 외", 17100, 950);
		
		b.information();
		
		//(Q) a와 b의 가격차이는?
		System.out.println(a.getPrice()-b.getPrice());
		
		
	}

}
