package gameBasic;

public class GameMain {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GameBasicInterface game = new GameBasicInterface();
		game.gameInterface();

	}

}
