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

	public void updated(Student student, String user) {
		String sql1 = "UPDATE student SET email = ? where username = ?";
		Connection conn1 = null;
		try {
			conn1 = dataSource.getConnection();
			PreparedStatement ps1 = conn1.prepareStatement(sql1);
			
			ps1.setString(1, student.getEmail());
			ps1.setString(2, user);
			ps1.executeUpdate();
			System.out.println("did it");
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn1!= null) {
				try{conn1.close();}
			 catch (SQLException e) {}
			}
		}
	}

	
	
	public Student login(Student student, String user, String pass) {
		String sql = "SELECT username, password, email FROM student WHERE username = ?";
		Connection conn = null;
		String user1 = null;
		String pass1 = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, student.getUsername());
			ResultSet rs = ps.executeQuery();

			System.out.println(student.getUsername());
			while (rs.next()) {
				if (rs.getString("username").equals(user)) {
					user1 = rs.getString("username");
					pass1 = rs.getString("password");

				}
			}
			if (user1 != null) {
				if (pass1.equals(pass)) {
					System.out.println("done");
					student = new Student(rs.getString("username"), null, rs.getString("password"));
				} else {
					System.out.println("parola incorecta");
					student = null;
				}

			} else {
				System.out.println("username inexistent");
				student = null;
			}

		} catch (SQLException e) {
		}
		return student;

	}
	
	public Student findByStudentUser(Student student, String user) {
		String sql = "SELECT * FROM student WHERE username = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
		
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
	
	public void deleted(Student student, String user) {
		String sql = "DELETE FROM student where username=?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.executeUpdate();
		} catch (Exception e) {
		}

	}
}
