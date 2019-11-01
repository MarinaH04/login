package com.student.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudentDAO;
import com.student.model.Student;




public class App {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		StudentDAO studentDAO =  (StudentDAO) context.getBean("studentDAO");
		
//		Student student = new Student(10, "Mihaela", "miha@yahoo.com", "12asd");
		
		Student student = new Student();
		student.setEmail("mary@yahoo.com");
		student.setPassword("12ppsd");
		student.setUsername("Maria");
		
		
		studentDAO.insert(student);
		
		Student student1 = studentDAO.findByStudentId(4);
		System.out.println(student1);
	}

}
