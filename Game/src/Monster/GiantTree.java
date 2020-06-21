package Monster;

public class GiantTree extends Monster {

	public GiantTree() {
		setName("뒤덮는 불안");
		setHp(10);
		setAttack(4);
		setDefense(3);
		setGold((int)(Math.random()*6));
		setEx(10);
		
	}

}
