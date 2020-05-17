package Monster;

public class Orc extends Monster {
		
	Orc() {
		setName("오크");
		setHp(50);
		setAttack(8);
		setDefense(3);
		setGold((int)(Math.random()*10));
		setEx(20);
	}


}
