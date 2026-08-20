import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx1 {

	public static void main(String[] args) {

		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"))) {
			bw.write("1001, 홍길동, 10000");
			bw.newLine();
			bw.write("1002, 김길동, 100000, VIP");
			bw.newLine();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
