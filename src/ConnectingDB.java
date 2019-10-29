
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.SQLException;



public class ConnectingDB {
	
	static Connection connection = null;
	static String databaseName="student_database";
	static String url="jdbc:mysql://localhost:3306/" +databaseName;
	static String username="root";
	static String password="Lhtlil@004";

	
	public static void getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
//		PreparedStatement ps = connection.prepareStatement("INSERT INTO `student`.`student` (`name`) VALUES ('michael clark');");
//		int status = ps.executeUpdate();
		
		if(connection!=null) {
			System.out.println("Database was Connected");
		
	}

	}

}