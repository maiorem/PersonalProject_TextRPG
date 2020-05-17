package player;

import Monster.Monster;

public class Player {
	
	String name;	// 플레이어 이름
	int level;		// 레벨
	int hp;			// 피통
	int attack; 	// 공격력
	int defense;	// 방어력;
	int gold;
	int ex;
	
	public Player(String name) {
		this.name=name;
		level=1;
		hp=100;
		attack=1;
		defense=1;
		gold=0;
		ex=0;
	}
	
	
	int levelSet() {
		switch(ex) {
		case 5:
			level=2;
			break;
		case 10:
			level=3;
			break;
		case 20:
			level=4;
			break;
		case 40:
			level=5;
			break;
		case 100:
			level=6;
			break;
		case 200:
			level=7;
			break;
		case 500:
			level=8;
			break;
		case 1000:
			level=9;
			break;
		case 2000:
			level=10;
			break;
		}
		return level;
	}
	
	void levelUpPoint() {
		hp=hp+(hp*levelSet());
		attack=attack+(attack*levelSet());
		defense=defense+(defense*levelSet());
	}
	
	
	int getEx(Monster m) {
		ex=ex+m.getEx();
		return ex;
	}
	
	
	int getGold(Monster m) {
		gold=gold+m.getGold();
		return gold;
	}
	
	
	void attack(Monster m) {
		m.setHp(m.getHp()-(int)(Math.random()*6)*attack);
		System.out.println("플레이어 "+name+"가 몬스터 "+m.getName()+"에게 "+this.attack+"만큼 데미지를 주었다!");
	}
	
	
	void move(int distanse) {
		System.out.println("플레이어 "+name+"은(는) "+distanse+"칸 이동하였다.");
	}
	
	public void showInfo() {
		System.out.println("▒▒▒▒ P L A Y E R ▒▒▒▒");
		System.out.println("이름 : "+this.name);
		System.out.println("레벨 : "+this.level);
		System.out.println("생명 : "+this.hp);
		System.out.println("공격력 : "+this.attack);
		System.out.println("방어력 : "+this.defense);
		System.out.println("돈 : "+this.gold);
		System.out.println("경험치 : "+this.ex);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	
	
	
}
