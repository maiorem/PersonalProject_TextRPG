package dialogue;

import java.util.Scanner;
import gameBasic.GamePlayManager;
import map.village.*;


public class Openning {

	Scanner sc = new Scanner(System.in);
	GamePlayManager manager = new GamePlayManager();
	Village vil;


	public void basicMenu() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒           D R E A M I N G , Y O U           ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒                                             ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 1. N E W  G A M E                           ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 2. L O A D  G A M E                         ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 3. E X I T                                  ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}

	public void dialogueNoname() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("아마도 이것은 꿈이다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("내가 그렇게 생각한 것은, 나에 대해 모호하게 느껴지기 때문이다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("내가 누군지, 내 형체가 어떠한지, 모든 것이 흐릿하다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그냥... 존재 자체가 부웅 떠 있는 기분.");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}
		System.out.println("문득 밖으로 나가야 한다는 생각이 들었다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("하지만 어떻게 나가지? 나는 형체가 없는데.\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(">> 당신의 이름을 지어주세요. <<");

	}

	public void myNameIs() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이름을 떠올린 순간, 갑자기 나의 형체가 명확해졌다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이제 발을 딛고 땅에 설 수 있어.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그런데 내가 어떻게 생겼지?\n");
		System.out.println(">> 스스로의 모습을 확인하고 싶다면 Enter키를 누르세요. <<");
		return;
	}

	public void whereAmI() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("아직 뭐가 뭔지 모르겠지만 스스로가 형편없다는 사실은 알 것 같다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("뭔가 갖춰야할 것 같은데....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("...라고 생각하자, 저 멀리 마을 비슷한 것들이 보였다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("역시 이건 꿈이다. 어떻게 깰 수 있는지는 모르겠다.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("우선 제일 가까운 마을에 가 보기로 했다.\n");
		return;
	}


	public void tutorialMakePlayer() {
		while(true) {
			dialogueNoname();
			String name = sc.nextLine();
			manager.creatPlayer(name);
			myNameIs();
			String enter = sc.nextLine();
			if(enter.isEmpty()) {
				manager.showInfo(name);
				whereAmI();
				vil=new SaltVillage();
				vil.villageMenu(name);


			
			}

		}
	}

}
