import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionEx1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // Driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kostadb26_2", 
					"root", "1212"); // url, username, password
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate("insert into user (id, name) values('hong', '홍길동')");
			System.out.println(cnt + "개의 데이터가 삽입되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
