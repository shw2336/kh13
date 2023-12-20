package oop.inner2;

public class Police {
	private String name, level;
	private Gun gun;
	
	public Police(String name, String level) {
		this.setName(name);
		this.setLevel(level);
		//총은 Police만 접근이 가능하므로 외부 설정이 아니라 직접 생성한다
		Gun gun = new Gun();
		this.setGun(gun);
	}
	
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getLevel() {
		return level;
	}

	private void setLevel(String level) {
		this.level = level;
	}

	private Gun getGun() {
		return gun;
	}

	private void setGun(Gun gun) {
		this.gun = gun;
	}

	
	//중첩 클래스(inner class, nested class)
	//-특정 클래스에 "소속"된 클래스
	private class Gun{
		
	}

}
