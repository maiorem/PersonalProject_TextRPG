package Monster;

public class Slime extends Monster {

	public Slime() {
		setName("슬라임");
		setHp(5);
		setAttack(1);
		setDefense(2);
		setGold((int)(Math.random()*2));
		setEx(4);
	}

}
