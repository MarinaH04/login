
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	
	

public class AddUsers extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String user = req.getParameter("user");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		ConnectingDB connection = new ConnectingDB();
		try {
			connection.getConnection();
			connection.RegisterUser(user, email, pass);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws IOException, ServletException {
		
	}
}
