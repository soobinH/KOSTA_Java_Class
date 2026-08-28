import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBInsertEx2 {
	public static void queryUser(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kostadb26_2", "root", "1212");
			pstmt = conn.prepareStatement("select id, name from user where id=?");
			pstmt.setString(1,id);
			rset = pstmt.executeQuery();
			
			if(rset!=null && rset.next()) {
					String sid = rset.getString("id");
					String name= rset.getString("name");
					System.out.println(String.format("id:%s, name: %s", sid, name));
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset!=null) rset.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		queryUser("song");
		
	}

}
