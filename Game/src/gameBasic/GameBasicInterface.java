package gameBasic;

import java.util.Scanner;

import dialogue.Openning;

public class GameBasicInterface {
	
	Openning open = new Openning();
	Scanner sc = new Scanner(System.in);
	GamePlayManager manager = new GamePlayManager();


	void gameInterface() {
		while(true){
			open.basicMenu();
			int num = Integer.parseInt(sc.nextLine().trim());
			switch(num) {
			case 1 :
				open.tutorialMakePlayer();

				break;
			case 2 :
				System.out.println(">> 불러 올 이름을 입력하세요 <<");
				System.out.print("이름 : " );
				String name=sc.nextLine();
				manager.getYou().get(name).loadPlayer();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}

}
