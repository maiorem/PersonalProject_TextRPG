package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class SaltSeller extends Npc {

	

	

	public SaltSeller() {
		super.name="소금장수";
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
		Npc npc = new SaltSeller();
		game.getYou().get(name).meetingNpc(this.name, npc);
		System.out.println("\"이 공기...\"");
		System.out.println("\"이 짠맛....\"");
		System.out.println("\"너도... 뭔가 느끼나?\"");
		System.out.println("1.무시한다\t2.들어본다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			System.out.println("\n\"하긴 일반인이 뭘 알리가 없지...\"\n");
			int impD=GamePlayManager.dice();
			System.out.println("소금장수의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(name, impD);
			return;
		} else {
			System.out.println("\n\"소금이... 진동하고 있어.\"");
			System.out.println("\"울고 있나? 뭔가를 부르고 있는 것 같아...\"\n");
			System.out.println("|| 무슨 일인지는 모르겠지만 소름이 돋아 도망치고 말았다. \n");
			int impU=GamePlayManager.dice();
			System.out.println("소금장수의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(name, impU);
			return;
		}
		
	}

}
