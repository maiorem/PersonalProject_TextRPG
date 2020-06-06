package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static void getConnection() throws SQLException {
		Connection conn=DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "SCOTT", "tiger");
	}
	
	
}
