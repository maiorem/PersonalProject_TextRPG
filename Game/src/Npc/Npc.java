package Npc;

import java.util.HashMap;

import player.Player;

public abstract class Npc {

	String name;
	int impress;
	
	public Npc() {
	}

	public Npc(String name) {
		this.name = name;
		this.impress=0;
	}


	public void impressUp(String pname, int impU) {
		Player you = new Player(pname);
		this.impress=you.getImp(name)+impU;
		
	}
	


	public void impressDown(String pname, int impD) {
		Player you = new Player(pname);
		if(you.getImp(name)==0) {
			impress=0;
		} else {
			this.impress=you.getImp(name)-impD;
		}
		
	}

	
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
	
	protected abstract void finalMeeting(String name);

	protected abstract void sixthMeething(String name);

	protected abstract void fifthMeeting(String name);

	protected abstract void forthMeeting(String name);

	protected abstract void thidMeeting(String name);

	protected abstract void secondMeeting(String name);

	protected abstract void firstMeeting(String name);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImpress() {
		return impress;
	}

	public void setImpress(int impress) {
		this.impress = impress;
	}




	
}
