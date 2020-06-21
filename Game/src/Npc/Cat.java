package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class Cat extends Npc {

	
	

	public Cat() {
		this.name="고양이";
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
		Npc npc = new Cat();
		Player you = new Player(name);
		you.meetingNpc(this.name, npc);
		Thread.sleep(500);
		System.out.println("\"왜애애애애애옹.\"\n");
		Thread.sleep(500);
		System.out.println("고양이에겐 미안한 일이지만 뭘 원하는지 모르겠다.");
		Thread.sleep(500);
		System.out.println("1.무시한다\t2.뭔가를 준다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			Thread.sleep(500);
			System.out.println("\n고양이가 나를 빤히 보다 뒤돌아 사라졌다.");
			int impD=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("고양이의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(you, impD);
			return;
		} else {
			Thread.sleep(500);
			System.out.println("주머니를 뒤져 보았으나 쥐어지는 것은 공기 뿐이다.");
			Thread.sleep(500);
			System.out.println("고양이가 내 빈 손을 물끄러미 바라보다 콧방귀를 뀌고 도망갔다.");
			Thread.sleep(500);
			System.out.println("상처 받았다...\n");
			int impU=GamePlayManager.dice();
			Thread.sleep(500);
			System.out.println("고양이의 호감도가 "+impU+"만큼 올랐다\n");
			impressUp(you, impU);
			return;
		}
		
	}

}
