package com.student.model;


public class Student {
	int studentID;
	String username;
	String email;
	String password;
	public Student( String username, String email, String password) {
	
		this.username = username;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", username=" + username + ", email=" + email + ", password="
				+ password + "]";
	}
	public Student() {
		super();
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
