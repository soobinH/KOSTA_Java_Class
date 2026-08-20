import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
			String line = null;
			while((line = br.readLine()) != null) {
				String[] items = line.split(",");
				if(items.length == 3) {
					System.out.printf("계좌번호: %s, 이름: %s, 잔액: %s", items[0], items[1], items[2]);
				} else if(items.length ==4) {
					System.out.printf("계좌번호: %s, 이름: %s, 잔액: %s, 등급: %s", items[0], items[1], items[2], items[3]);
				}
				
				System.out.println();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
