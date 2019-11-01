
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;



public class ConnectingDB {
	
	static Connection connection = null;
	static String databaseName="student_database";
	static String url="jdbc:mysql://localhost:3306/" +databaseName;
	static String username="root";
	static String password="Lhtlil@004";

	
	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);

		
		if(connection!=null) {
			System.out.println("Database was Connected");
		
	}
		return connection;
	}
	
	public void RegisterUser(String user, String Email, String pass) throws SQLException {
		PreparedStatement ps = (PreparedStatement) connection.prepareStatement("INSERT INTO `student` (`username`, `email`, `password`) VALUES ('"+user+"','"+Email+"','"+pass+"');");
		ps.executeUpdate();
		
	}

}