package com.student.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.student.dao.StudentDAO;
import com.student.model.Student;

public class JdbcStudentDAO implements StudentDAO {
	
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public void insert(Student student) {
		String sql = "INSERT INTO student" + "(username, email, password) VALUES (?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, student.getUsername());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPassword());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn!= null) {
				try{conn.close();}
			 catch (SQLException e) {}
			}
		}
	}

	
	public Student findByStudentId(int studID) {
		String sql = "SELECT * FROM student WHERE studentID = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, studID);
			Student student = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				student = new Student(
						
						rs.getString("username"),
						rs.getString("email"),
						rs.getString("password")
						);
			}
			rs.close();
			ps.close();
			return student;
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch(SQLException e) {}
			}
		}
		
	}

}
