

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Main extends ConnectingDB{
	
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		getConnection();
		
		String query = "create table if not exists Student(studentID int NOT NULL AUTO_INCREMENT, username varchar(40), email varchar(40), password varchar(40), PRIMARY KEY(studentID))";
		PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
		
		int status = ps.executeUpdate();
		System.out.println(status);	
		if(status >= 0) {
			System.out.println("table created");		
		}
		
		String query2 = "create table if not exists Cursuri(cursID int NOT NULL AUTO_INCREMENT, denumire varchar(40), PRIMARY KEY(cursID))";
		PreparedStatement ps2 = (PreparedStatement) connection.prepareStatement(query2);
		
		String query3 = "create table if not exists studcurs(idstudcurs int not null auto_increment, studID int not null, cursuriID int not null, PRIMARY KEY (idstudcurs, studID, cursuriID), INDEX fk_studcurs_student_idx (studID ASC) VISIBLE, INDEX fk_studcurs_cursuri_idx (cursuriID ASC) VISIBLE, CONSTRAINT fk_studcurs_student FOREIGN KEY (studID) REFERENCES student(studentID) ON DELETE CASCADE ON UPDATE CASCADE, CONSTRAINT fk_studcurs_cursuri FOREIGN KEY (cursuriID) REFERENCES cursuri(cursID) ON DELETE CASCADE ON UPDATE CASCADE)";
		PreparedStatement ps3 = (PreparedStatement) connection.prepareStatement(query3);
		
		int status2 = ps2.executeUpdate();
		System.out.println(status);	
		if(status2 >= 0) {
			System.out.println("table2 created");		
		}
		
		int status3 = ps3.executeUpdate();
		System.out.println(status3);	
		if(status3 >= 0) {
			System.out.println("table3 created");		
		}
		
//		Statement st = (Statement) connection.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		rs.next();
//		String name=rs.getString("name");
//		System.out.println(name);
//		
//		st.close();
		connection.close();
	}
}
