package Npc;

import gameBasic.GamePlayManager;

public class OldMan extends Npc {
	
	String name;
	int impress;

	public OldMan(){
		this.name="수상한 노인";
		this.impress=0;
	}
	
	
	@Override
	public void action() {
		
		switch(impress) {
		case 0:
			firstMeeting();
			break;
		case 1: case 2: case 3: 
			secondMeeting();
			break;
		case 4: case 5: case 6:
			thidMeeting();
			break;
		case 7: case 8:
			forthMeeting();
			break;
		case 9:
			fifthMeeting();
			break;
		case 10:
			sixthMeething();
			break;
		default :
			finalMeeting();
			break;
		}
		

	}

	
	public void firstMeeting() {
		System.out.println("\"자네... 눈이 맑군.\"");
		System.out.println("\"귀중한 말씀이 있는데 들어보지 않겠나.\"\n");
		System.out.println("1.무시한다\t2.들어본다.");	
		int choice=Integer.parseInt(GamePlayManager.sc.nextLine());
		if(choice==1) {
			System.out.println("\n\"요새 젊은 것들은...\"\n");
			int impD=GamePlayManager.dice();
			System.out.println("노인의 호감도가 "+impD+"만큼 떨어졌다...\n");
			impressDown(impD);
			return;
		} else {
			System.out.println("\n\"딱한 젊은이로고.\"");
			System.out.println("\"다음부터는 누가 이런 식으로 말을 걸거든 도망가라구.\"\n");
			int impU=GamePlayManager.dice();
			System.out.println("노인의 호감도가 "+impU+"만큼 올랐다!\n");
			impressUp(impU);
			return;
		}
		
	}
	
	public void secondMeeting() {
		
	}


	@Override
	protected void finalMeeting() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void sixthMeething() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void fifthMeeting() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void forthMeeting() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void thidMeeting() {
		// TODO Auto-generated method stub
		
	}
	
	
}
