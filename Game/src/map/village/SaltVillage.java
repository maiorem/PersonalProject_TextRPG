package map.village;

import java.util.Scanner;

import Npc.*;
import map.village.BasicStore.*;

public class SaltVillage extends Village {
		
	Npc theOld = new OldMan();
	Npc flower = new FlowerKid();
	Npc kitty = new Cat();
	Npc saltseller = new SaltSeller();	

	
	
	@Override
	public void villageMenu(String name) {
		System.out.println("======================================================================");
		System.out.println("▩▩▩ 소금마을에 도착하셨습니다 ▩▩▩");
		System.out.println("======================================================================");		
		super.villageMenu(name);		
	}



	public void walk(String name) {
		System.out.println("마을을 걷고 있다.");
		System.out.println("저기 누군가 걸어오고 있는 것 같은데... \n");
		System.out.println("** 주사위를 굴리려면 Enter키를 누르세요 ** ");
		String enter = input.nextLine();
		if(enter.isEmpty()) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println("** 주사위 결과는 "+dice+"입니다 **\n");
			switch(dice) {
			case 1:
				System.out.println("그냥 바람이었다....");
				System.out.println("아무도 만나지 못했다.\n ");
				return;
			case 2:
				System.out.println("나무의 그림자를 착각했어.");
				System.out.println("아무도 만나지 못했다.\n ");
				return;
			case 3:
				System.out.println("노인이 다가오고 있다.\n");
				theOld.action(name);
				return;
			case 4:
				System.out.println("꽃을 들고 있는 아이가 다가온다.\n");
				flower.action(name);
				return;
			case 5:
				System.out.println("고양이 한마리가 말을 걸어왔다.\n");
				kitty.action(name);
				return;
			case 6:
				System.out.println("소금장수가 멀뚱히 지평선을 바라보며 서 있다.\n");
				saltseller.action(name);
				return;
			}
			
		}
				
				
	}


	
	

	@Override
	public void battleStoreVisit(String name) {
		
		
	}



	@Override
	public void storeVisit(String name) {
		
	}


	@Override
	public void innVisit(String name) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void goOut(String name) {
		// TODO Auto-generated method stub
		
	}




}
