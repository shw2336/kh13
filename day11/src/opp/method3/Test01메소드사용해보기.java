package opp.method3;

import javax.xml.crypto.Data;

public class Test01메소드사용해보기 {
	public static void main(String[] args) {
		
		Payment a = new Payment();
		Payment b = new Payment();
		Payment c = new Payment();
		
		a.data("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		b.data("KT", "5G세이브", 45000, 100, 900, 1500);
		c.data("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		a.information();
		System.out.println();
		b.information();
		System.out.println();
		c.information();
		
	}
}