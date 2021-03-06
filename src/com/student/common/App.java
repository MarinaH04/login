package com.student.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudentDAO;
import com.student.model.Student;




public class App extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
		 
		String user = req.getParameter("user");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Student student = new Student();
		student.setUsername(user);
		student.setEmail(email);
		student.setPassword(pass);
		
		
		studentDAO.insert(student);
		
//		student.setEmail("mariana@yahoo.com");
//		studentDAO.updated(student, 17);
//		
//		Student student1 = studentDAO.findByStudentId(12);
//		System.out.println(student1);

		 
		res.sendRedirect("formular.jsp");
		
		
		
}
	
	

}
