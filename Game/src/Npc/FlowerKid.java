package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class FlowerKid extends Npc {


	

	public FlowerKid() {
		this.name="꽃파는 아이";
		this.impress=0;
	}
	


	@Override
	protected void finalMeeting(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void sixthMeething(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void fifthMeeting(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void forthMeeting(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void thidMeeting(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void secondMeeting(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void firstMeeting(String name) throws InterruptedException {
		Npc npc = new FlowerKid();
		Player you = new Player(name);
		you.meetingNpc(this.name, npc);
		Thread.sleep(500);
		System.out.println("\"꽃 한송이 사시겠어요?\"\n");
		Thread.sleep(500);
		System.out.println("1.무시한다\t2.산다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			Thread.sleep(500);
			System.out.println("\n\"너무해...\"\n");
			int impD=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("아이의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(you, impD);
			return;
		} else {
			Thread.sleep(500);
			System.out.println("\n\"돈이 저보다 없으시네요...\"\n");
			int impU=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("아이의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(you, impU);
			return;
		}
		
	}

}
