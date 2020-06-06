package map.village;

import java.util.Scanner;

import Npc.Npc;
import gameBasic.GamePlayManager;
import map.village.BasicStore.BattleStore;
import map.village.BasicStore.Inn;
import map.village.BasicStore.Store;
import player.Player;
import sun.font.CreatedFontTracker;

public abstract class Village {

	Scanner input = new Scanner(System.in);
	GamePlayManager game=new GamePlayManager();

	Npc storeSeller;
	Npc battleShopSeller;
	Npc innOwner;

	BattleStore battle;
	Store shop;
	Inn inn;


	public void villageMenu(String name) {
		System.out.println("======================================================================");
		System.out.println("마을에 도착했다.");
		System.out.println("집과 사람들을 보니 마음이 안정되는 것을 느낀다.");
		while(true) {
			System.out.println("======================================================================");
			System.out.println("1.걷는다.\t\t 2.상점에 간다.\t 3.여관을 찾는다.\t 4. 무기점에 간다.\n5.마을을 나간다.\t 6.내 상태를 본다.\n7.게임을 저장한다.\t 8.게임을 종료한다.");
			System.out.println("======================================================================");
			int sel=Integer.parseInt(input.nextLine().trim());
			switch(sel) {
			case 1:
				walk(name);
				continue;
			case 2:
				storeVisit(name);
				continue;
			case 3:
				innVisit(name);
				continue;
			case 4:
				battleStoreVisit(name);
				continue;
			case 5:
				goOut(name);
				break;
			case 6:
				showMyStatus(name);
				continue;
			case 7:
				saveGame(name);
				break;
			case 8:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
		}

	}

	abstract public void walk(String name);

	abstract public void storeVisit(String name);

	abstract public void innVisit(String name);
	
	abstract public void battleStoreVisit(String name);

	public void showMyStatus(String name) {
		game.getYou().get(name).showInfo();
	}


	public void saveGame(String name) {
		game.getYou().get(name).savePlayer();
	}

	abstract public void goOut(String name);

}
