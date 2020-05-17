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
				
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}

}
