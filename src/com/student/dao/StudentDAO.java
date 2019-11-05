package com.student.dao;
import com.student.model.Student;

public interface StudentDAO {
	public void insert(Student student);
	public Student findByStudentUser(Student student, String user);
	public void updated(Student student, int i);
	public Student login(Student student, String user, String pass);
}
