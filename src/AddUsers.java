import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	

	

	public class AddUsers extends HttpServlet{
		
		
		 private static final long serialVersionUID = 1L;
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			String user = req.getParameter("user");
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			 
			
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			session.setAttribute("email", email);
			session.setAttribute("pass", pass);
			res.sendRedirect("useradd.jsp");
		}
		public static void main(String[] args) throws IOException, ServletException {
			
		}
	}
		
		
