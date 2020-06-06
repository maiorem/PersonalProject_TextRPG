package Npc;

public abstract class Npc {

	String name;
	int impress;

	
	public void impressUp(int impU) {
		this.impress=impress+impU;
	}


	public void impressDown(int impD) {
		if(impress==0) {
			impress=0;
		} else {
			this.impress=impress-impD;
		}
		
	}

	
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
	
	protected abstract void finalMeeting();

	protected abstract void sixthMeething();

	protected abstract void fifthMeeting();

	protected abstract void forthMeeting();

	protected abstract void thidMeeting();

	protected abstract void secondMeeting();

	protected abstract void firstMeeting();

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
