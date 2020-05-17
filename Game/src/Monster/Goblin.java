package Monster;

public class Goblin extends Monster {

	public Goblin() {
		setName("고블린");
		setHp(20);
		setAttack(3);
		setDefense(6);
		setGold((int)(Math.random()*8));
		setEx(15);
	}

	
	
}
