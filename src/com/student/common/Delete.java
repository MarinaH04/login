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

public class Delete extends HttpServlet {

	private static final long serialVersionUID = 1L;
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
		HttpSession session= req.getSession();  
		String username = (String) session.getAttribute("username");
		System.out.println("Usernameul este "+username);
		 Student student = new Student();
		 student.setUsername(username);
		 studentDAO.deleted(student, username);
		 session.invalidate();
		
		res.sendRedirect("formular.jsp");

}

}
