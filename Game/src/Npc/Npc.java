package Npc;

public abstract class Npc {

	String name;
	int impress;

	
	abstract public void action();
	
	abstract public void impressUp(int impU);
	
	abstract public void impressDown(int impD);
	
}
