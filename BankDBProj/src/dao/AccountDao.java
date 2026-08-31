package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import acc.Account;
import acc.SpecialAccount;

public class AccountDao extends DBConnection {
	public int insertAccount(Account acc) {
		Connection conn = getConnection();
		String sql = "insert into account(id,name, balance, grade) values (?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  acc.getId());
			pstmt.setString(2,  acc.getName());
			pstmt.setInt(3, acc.getBalance());
			if(acc instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount)acc).getGrade());
			} else {
				pstmt.setString(4, null);
			}
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return cnt;
	}
	
	public int updateBalance(Account acc) {
		return 0;
	}
	
	public Account selectAccount(String id) {
		return null;
	}
	
	public List<Account> selectAccountList() {
		Connection conn = getConnection();
		String sql = "select id, name, balance, grade from account";
		Statement stmt = null;
		ResultSet rset = null;
		List<Account> list = new ArrayList<Account>();
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset != null) {
				while(rset.next()) {
					Account acc = null;
					String id = rset.getString("id");
					String name = rset.getString("name");
					int balance = rset.getInt("balance");
					String grade = rset.getString("grade");
					if(grade == null) {
						acc = new Account();
					}
				}
			}
		}
		
		return null;
	}
}
