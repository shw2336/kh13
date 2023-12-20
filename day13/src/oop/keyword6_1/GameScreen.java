package oop.keyword6_1;

public class GameScreen {
	private String title;
	private final int width;
	private final int height;

	public GameScreen(String title, int width, int height) {
		this.setTitle(title);
		this.width = width;
		this.height = height;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getResolution() {
		return this.width * this.height;
	}

	public void information() { 
		System.out.println("<게임화면 정보>");
		System.out.println("타이틀 : " + this.title);
		System.out.println("해상도 : "+this.getResolution()
									+ "("+this.width+" x "+this.height+")");
	}
}