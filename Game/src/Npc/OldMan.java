package Npc;

import gameBasic.GamePlayManager;
import player.Player;

public class OldMan extends Npc {


	public OldMan(){
		super.name="수상한 노인";
		super.impress=0;
	}
	



	@Override
	public void action(String name) {
		
		switch(impress) {
		case 0:
			firstMeeting(name);
			break;
		case 1: case 2: case 3: 
			secondMeeting(name);
			break;
		case 4: case 5: case 6:
			thidMeeting(name);
			break;
		case 7: case 8:
			forthMeeting(name);
			break;
		case 9:
			fifthMeeting(name);
			break;
		case 10:
			sixthMeething(name);
			break;
		default :
			finalMeeting(name);
			break;
		}
		

	}
	
	
	public void firstMeeting(String name) {
		Npc npc = new OldMan();
		game.getYou().get(name).meetingNpc(this.name, npc);
		System.out.println("\"자네... 눈이 맑군.\"");
		System.out.println("\"귀중한 말씀이 있는데 들어보지 않겠나.\"\n");
		System.out.println("1.무시한다\t2.들어본다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			System.out.println("\n\"요새 젊은 것들은...\"\n");
			int impD=GamePlayManager.dice();
			System.out.println("노인의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(name, impD);
			return;
		} else {
			System.out.println("\n\"딱한 젊은이로고.\"");
			System.out.println("\"다음부터는 누가 이런 식으로 말을 걸거든 도망가라구.\"\n");
			int impU=GamePlayManager.dice();
			System.out.println("노인의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(name, impU);
			return;
		}
		
	}
	
	public void secondMeeting(String name) {
		
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
	
	
}
