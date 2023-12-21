package oop.inherit6;

public class Mp4파일 extends File {
	
	public Mp4파일(String name, int size) {
		super(name, size);

	}

	public void speed() {
		System.out.println("재생 속도");
	}
	
	public void forward() {
		System.out.println("빨리감기");
	}

	public void rewind() {
		System.out.println("되감기");
	}


}
