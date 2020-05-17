package gameBasic;

import java.util.HashMap;
import java.util.Scanner;
import player.Player;

public class GamePlayManager {



	HashMap<String,Player> you;
	Scanner sc;


	public GamePlayManager() {

		you = new HashMap<String, Player>();
		sc = new Scanner(System.in);
	}

	public void creatPlayer() {		
		Player you = null;
		System.out.println("** 이름을 생성합니다 **");
		String name = sc.nextLine();
		you = new Player(name);
		addPlayer(name, you);
		System.out.println("** 플레이어 "+you.getName()+"이/가 탄생하였습니다 **");
		System.out.println("** 플레이어가 사망하기 전까지는 돌이킬 수 없습니다 **");
	}

	void addPlayer(String pname, Player player) {
		you.put(pname, player);
	}

	public HashMap<String, Player> getYou() {
		return you;
	}

	public void showInfo(String name) {
		you.get(name).showInfo();
	}

	public String showName(String name) {
		return you.get(name).getName();
	}





}
