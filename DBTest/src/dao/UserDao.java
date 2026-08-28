package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.User;

public class UserDao extends DBConnection {

	public int insertUser(User user) {
		String sql = "insert user(id, name) values(?,?)";
		Connection conn = DBConnection.getConnection();
		
		
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
			
		}
		
		return cnt;
	}
	
	public int updateUser(User user) {
		String sql = "update user set name=? where id=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2,  user.getId());
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return cnt;
	}
	
	public int deleteUser(String id) {
		String sql = "delete from user where id=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return cnt;
	}
	
	public User selectUser(String id) {
		String sql = "select id, name from user where id=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User user = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  id);
			rset = pstmt.executeQuery();
			if(rset!=null&& rset.next()) {
				user = new User();
				user.setId(rset.getString("id"));
				user.setName(rset.getString("name"));
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		
		return user;
	}
	
	public List<User> selectUserList() {
		String sql = "select id, name from user";
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rset = null;
		List<User> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset != null) {
				while(rset.next()) {
					User user = new User();
					user.setId(rset.getString("id"));
					user.setName(rset.getString("name"));
					list.add(user);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
			close(conn);
		}
		
		return list;
	}

}
