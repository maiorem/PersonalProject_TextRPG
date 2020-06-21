package gameBasic;

public class GameMain {

	public static void main(String[] args) {

		GameBasicInterface game = new GameBasicInterface();
		try {
			game.gameInterface();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
