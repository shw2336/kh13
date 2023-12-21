package oop.inherit6_1내꺼;

public class File {
	
	private String name;
	private int size;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {

		this.size = size;
	}
	
	public File(String name, int size) {
		this.setName(name);
		this.setSize(size);
		
	}


	public void execute() {
		System.out.println("실행");
	}
	public void information() {
		System.out.println("정보출력");
	}


}
