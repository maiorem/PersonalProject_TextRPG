package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class SaltSeller extends Npc {

	

	

	public SaltSeller() {
		this.name="소금장수";
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
		Npc npc = new SaltSeller();
		Player you = new Player(name);
		you.meetingNpc(this.name, npc);
		Thread.sleep(500);
		System.out.println("\"이 공기...\"");
		Thread.sleep(500);
		System.out.println("\"대기가... 울고있군...\"");
		Thread.sleep(500);
		System.out.println("\"너도... 뭔가 느끼나?\"");
		Thread.sleep(500);
		System.out.println("1.무시한다\t2.들어본다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			Thread.sleep(500);
			System.out.println("\n\"하긴 일반인이 뭘 알리가 없지...\"\n");
			int impD=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("소금장수의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(you, impD);
			return;
		} else {
			Thread.sleep(500);
			System.out.println("\n\"내 오른손의 봉인이 금방이라도 풀릴 것 같아.\"");
			Thread.sleep(500);
			System.out.println("\"크윽...! 녀석에서 의식을 빼앗겨선 안돼...!\"\n");
			Thread.sleep(500);
			System.out.println("무슨 일인지는 모르겠지만 소름이 돋아 도망치고 말았다. \n");
			int impU=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("소금장수의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(you, impU);
			return;
		}
		
	}

}
