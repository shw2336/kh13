package oop.inherit5_1내꺼;

public class Test01 {
	public static void main(String[] args) {
		
		Purifier a = new Purifier();
		
		
		HotPurifier p1 = new HotPurifier();
		p1.hot();
		p1.normal();
		System.out.println();
		
		MultiPurifier p2 = new MultiPurifier();
		p2.normal();
		p2.cold();
		p2.hot();
		System.out.println();
		
		IcePurifier p3 = new IcePurifier();
		p3.normal();
		p3.cold();
		p3.ice();
		System.out.println();
		
		}
		
	}


