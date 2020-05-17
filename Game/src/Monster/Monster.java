package Monster;

public class Monster {

	private String name;	// 몬스터 이름
	private int hp;
	private int attack;
	private int defense;
	private int gold;
	private int ex;
		

	int damage(int attack) {
		int damage=(int)(Math.random()*6)*attack;
		return damage;
	}


	int rewardGold() {
		System.out.println(this.getName()+"를 해치웠다!");
		System.out.println(this.getName()+"은 "+getGold()+"를 떨궜다.");			
		return getGold();		
	}
	

	int rewardEx() {
		System.out.println("경험치가 "+getEx()+" 올랐다.");
		return getEx();
	}


	public String getName() {
		return name;
	}


	public int getHp() {
		return hp;
	}


	public int setHp(int hp) {
		return this.hp = hp;
	}


	public int getAttack() {
		return attack;
	}


	public int getDefense() {
		return defense;
	}


	public int getGold() {
		return gold;
	}


	public int getEx() {
		return ex;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public void setEx(int ex) {
		this.ex = ex;
	}
	
	
	
	
}
