package items;

public class SilkRobe extends Item {

	public SilkRobe(String equipmentName, int equipmentType, int attackPower, int health, int evasion, int gold) {
		super(equipmentName, equipmentType, attackPower, health, evasion, gold);

		this.equipmentName = "B_ShiningArmor";

		this.equipmentType = 2;

		this.attackPower = 10;

		this.health = 300;

		this.evasion = 1;

		this.gold = 600;

	}

	@Override
	public String toString() {
		return "B_ShiningArmor [equipmentName=" + equipmentName + ", equipmentType=" + equipmentType + ", attackPower="
				+ attackPower + ", health=" + health + ", evasion=" + evasion + ", gold=" + gold + "]";
	}

}
