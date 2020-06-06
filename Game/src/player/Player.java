package player;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import Monster.Monster;
import Npc.Npc;

public class Player {
	
	String name;	// 플레이어 이름
	int level;		// 레벨
	int hp;			// 피통
	int attack; 	// 공격력
	int defense;	// 방어력;
	int gold;
	int ex;
	HashMap<String, Npc> npcImpress = new HashMap<String, Npc>();
		
	public Player(String name) {
		this.name=name;
		level=1;
		hp=100;
		attack=1;
		defense=1;
		gold=0;
		ex=0;
	}
	
	
	public void meetingNpc(String npcName, Npc npc) {
		npcImpress.put(npcName, npc);

	}
	
	
	public int getImp(String npcName) {
		int nImp=0;
		nImp=npcImpress.get(npcName).getImpress();
		return nImp;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public HashMap<String, Npc> getNpcImpress() {
		return npcImpress;
	}

	public void setNpcImpress(HashMap<String, Npc> npcImpress) {
		this.npcImpress = npcImpress;
	}


	// 플레이어 상태 저장/불러오기 메서드
	public void loadPlayer() {// 불러오기
		FileInputStream f = null;
		ObjectInputStream oos = null;
//		Player load = new Player();
		String name;



		int bossCount, stage2Count, stage3Count;
		try {
			f = new FileInputStream("savedata.ser");
			oos = new ObjectInputStream(f);
			
			name=((String) oos.readObject());
			level=((Integer) oos.readObject());
			hp=((Integer) oos.readObject());		// 피통
			attack=((Integer) oos.readObject()); 	// 공격력
			defense=((Integer) oos.readObject());	// 방어력;
			gold= ((Integer) oos.readObject());
			ex= ((Integer) oos.readObject());

			
			this.setName(name);// 이름밖에 안불러와짐
			this.setLevel(level);

			this.setHp(hp);
			this.setAttack(attack);
			this.setDefense(defense);
			this.setGold(gold);
			this.setEx(ex);
			this.npcImpress=npcImpress;

			oos.close();
			System.out.println("플레이어 정보를 불러왔습니다");
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (f != null)
				try {
					f.close();
				} catch (IOException e) {
				}
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
				}
		}
	}

	public void savePlayer() {// 저장
		FileOutputStream f = null;
		ObjectOutputStream oos = null;
		try {

			f = new FileOutputStream("data.ser");
			oos = new ObjectOutputStream(f);

			oos.writeObject(this.getName());
			oos.writeObject(this.getLevel());
			oos.writeObject(this.getHp());
			oos.writeObject(this.getAttack());
			oos.writeObject(this.getDefense());
			oos.writeObject(this.getEx());
			oos.writeObject(this.getGold());
			oos.writeObject(this.getNpcImpress());

			
			f.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (f != null)
				try {
					f.close();
				} catch (IOException e) {
				}
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
				}

		}
		System.out.println("플레이어 정보가 저장되었습니다");
	}
}
	
	
	
	

