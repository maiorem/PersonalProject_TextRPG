package Npc;

public class OldMan extends Npc {
	
	String name;
	int impress;

	public OldMan(){
		this.name="수상한 노인";
		this.impress=0;
	}
	
	
	@Override
	public void action() {
		

	}

	
	public void impressUp(int impU) {
		
	}


	@Override
	public void impressDown(int impD) {
		
		
	}
	
	public void firstMeeting() {
		System.out.println("\"자네... 눈이 맑군.\"");
		System.out.println("\"귀중한 말씀이 있는데 들어보지 않겠나.\"\n");
		System.out.println("1.무시한다\t2.들어본다.");	
	}
	
	
	
	
}
