package oop.constructor3;

public class Character {
//	캐릭터에는 아이디, 직업, 레벨, 소지금 정보가 저장되어야 합니다.
//	사용자에게 아이디와 직업을 입력받습니다.
//	직업은 전사, 도적, 마법사 중에서만 설정 가능합니다.
//	레벨은 자동으로 1로 설정됩니다.
//	소지금은 캐릭터 생성 시 100 gold로 설정됩니다.
//	캐릭터 생성 후 정보를 출력해보세요
	
	private String id;
	private String job;
	private int level;
	private int money;
	
	Character(String id, String job) {
		this(id, job, 1, 100);
	}
	
	Character(String id, String job, int level, int money) {
		this.setId(id);
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getJob() {
		return job;
	}
	void setJob(String job) {
		switch(job) {
		case "전사":
		case "도적":
		case "마법사":
			this.job = job;
		}
	}
	int getLevel() {
		return level;
	}
	void setLevel(int level) {
		this.level = level;
	}
	int getMoney() {
		return money;
	}
	void setMoney(int money) {
		this.money = money;
	}
	
	void information() {
		System.out.println("캐릭터 생성");
		System.out.println("아이디 : " + this.getId());
		System.out.println("직업 : " + this.getJob());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("소지금 : " + this.getMoney());
	}
	
}
