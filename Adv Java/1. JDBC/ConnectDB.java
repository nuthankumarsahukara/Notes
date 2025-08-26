import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverclass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:orcl";
		String username="system";
		String pwd="nuthan99";
		
		try {
			Class.forName(driverclass);
			System.out.println("Driver class Found");
			Connection con=DriverManager.getConnection(url,username,pwd);
			System.out.println("Database Connected Successfully......");
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}

	}

}
