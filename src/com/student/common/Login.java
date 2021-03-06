package com.student.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
		HttpSession session= req.getSession();  
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Student student = new Student();
		student.setUsername(username);
		student.setPassword(password);
		String email = (studentDAO.findByStudentUser(student, username)).getEmail();
		if(studentDAO.login(student, username, password)!=null){
		
		 session.setAttribute("username",username);  
		 session.setAttribute("password", password);
		 session.setAttribute("email", email);
		res.sendRedirect("logged.jsp");}
		else {res.sendRedirect("formular.jsp");}
}
public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//	StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
//	Student student = new Student();
//	System.out.println(studentDAO.findByStudentUser(student, "Marina"));
//	
//	System.out.println((studentDAO.findByStudentUser(student, "Marina")).getEmail());
}

}