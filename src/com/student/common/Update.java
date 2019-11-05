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

public class Update extends HttpServlet {

	private static final long serialVersionUID = 1L;
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
		
		String userup = req.getParameter("userup");
		String emailup = req.getParameter("emailup");
		String passup = req.getParameter("passup");
		
		Student student = new Student();
		student.setUsername(userup);
		student.setEmail(emailup);
		student.setPassword(passup);
		studentDAO.updated(student, userup);
		
		res.sendRedirect("logged.jsp");

}

}
