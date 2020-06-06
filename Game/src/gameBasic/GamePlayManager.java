package gameBasic;

import java.util.HashMap;
import java.util.Scanner;
import player.Player;

public class GamePlayManager {



	HashMap<String,Player> you;
	public static Scanner sc;


	public GamePlayManager() {

		you = new HashMap<String, Player>();
		sc = new Scanner(System.in);
	}

	public static int dice() {
		return (int)(Math.random()*7);
		
	}
	
	
	public void creatPlayer(String name) {		
		Player you = new Player(name);
		addPlayer(name, you);
		System.out.println("\n** 플레이어 "+you.getName()+"이/가 탄생하였습니다 **");
		System.out.println("** 플레이어가 사망하기 전까지는 돌이킬 수 없습니다 **\n");
	}

	void addPlayer(String pname, Player player) {
		you.put(pname, player);
	}

	public HashMap<String, Player> getYou() {
		return you;
	}

	public void showInfo(String name) {
		try {
			you.get(name).showInfo();
			return;
		} catch(NullPointerException e) {
			System.out.println("\"뭘 하고 싶은 거야?\"");
			System.out.println("\"당신 지금 투명한 상태라는 거 알고 있어?\"");
			System.out.println("\"이름부터 만들지 그래\"\n");
			return;
		}
	}

	public String showName(String name) {
		return you.get(name).getName();
	}





}
