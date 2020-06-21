package Monster;

public class BigSpider extends Monster {

	public BigSpider() {
		setName("비대한 자책");
		setHp(5);
		setAttack(1);
		setDefense(2);
		setGold((int)(Math.random()*2));
		setEx(4);
	}

}
