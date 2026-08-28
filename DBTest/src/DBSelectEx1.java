import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectEx1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kostadb26_2", "root", "1212");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from user");
			if(rset!=null) {
				while(rset.next()) {
					String id = rset.getString("id");
					String name= rset.getString("name");
					System.out.println(String.format("id:%s, name: %s", id, name));
				}
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset!=null) rset.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
