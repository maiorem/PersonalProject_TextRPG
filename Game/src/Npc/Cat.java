package Npc;

import gameBasic.GamePlayManager;

public class Cat extends Npc {

	
	

	public Cat() {
		super.name="고양이";
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
		System.out.println("\"왜애애애애애옹.\"\n");
		System.out.println("|| 고양이에겐 미안한 일이지만 뭘 원하는지 모르겠다.\n");
		System.out.println("1.무시한다\t2.뭔가를 준다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			System.out.println("\n\"|| 고양이가 나를 빤히 보다 뒤돌아 사라졌다.\"\n");
			int impD=GamePlayManager.dice();
			System.out.println("고양이의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(name, impD);
			return;
		} else {
			System.out.println("\n\"뭐 가지고 있는 척 하지 마. 거지주제에.\"\n");
			System.out.println("|| 고양이가 깔깔 웃으며 도망갔다. ");
			System.out.println("|| 상처 받았다.\n");
			int impU=GamePlayManager.dice();
			System.out.println("고양이의 호감도가 "+impU+"만큼 올랐다\n");
			impressUp(name, impU);
			return;
		}
		
	}

}
