package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class FlowerKid extends Npc {


	

	public FlowerKid() {
		super.name="꽃파는 아이";
		super.impress=0;
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
	protected void firstMeeting(String name) {
		Npc npc = new FlowerKid();
		game.getYou().get(name).meetingNpc(this.name, npc);
		System.out.println("\"꽃 한송이 사시겠어요?\"\n");
		System.out.println("1.무시한다\t2.산다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			System.out.println("\n\"너무해...\"\n");
			int impD=GamePlayManager.dice();
			System.out.println("아이의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(name, impD);
			return;
		} else {
			System.out.println("\n\"돈이 저보다 없으시네요...\"\n");
			int impU=GamePlayManager.dice();
			System.out.println("아이의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(name, impU);
			return;
		}
		
	}

}
