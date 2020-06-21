package Monster;

public class DarkSand extends Monster {
		
	DarkSand() {
		setName("갉아먹는 의식");
		setHp(50);
		setAttack(8);
		setDefense(3);
		setGold((int)(Math.random()*10));
		setEx(20);
	}


}
