

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) throws IOException{
		Properties props = new Properties();
		props.setProperty("driver", "org.mariadb.jdbc.Driver");
		props.setProperty("url", "jdbc:mariadb://localhost:3306/testdb26_2");
		props.setProperty("username", "root");
		props.setProperty("password", "7674");
		
//		FileOutputStream fos = new FileOutputStream("db.properties");
//		props.store(fos,  "Database setting");
//		fos.close();
		
		FileOutputStream fos= new FileOutputStream("db2.properties");
		props.storeToXML(fos, "Database setting");
		fos.close();
	}

}
