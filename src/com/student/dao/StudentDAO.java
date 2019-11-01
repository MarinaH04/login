package com.student.dao;
import com.student.model.Student;

public interface StudentDAO {
	public void insert(Student student);
	public Student findByStudentId(int studID);
}
