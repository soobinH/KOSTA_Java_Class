import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream("db.properties");
//			props.load(fis);
			fis = new FileInputStream("db2.properties");
			props.loadFromXML(fis);
			System.out.println(props.getProperty("driver"));
			System.out.println(props.getProperty("password"));
			System.out.println(props.getProperty("url"));
			System.out.println(props.getProperty("username"));

		}catch(IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if(fis!=null) fis.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
