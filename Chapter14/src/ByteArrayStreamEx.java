import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream bai = null;
		ByteArrayOutputStream bao = null;
		
		bai = new ByteArrayInputStream(inSrc);
		bao = new ByteArrayOutputStream();
		
		int data = 0;
		while((data = bai.read()) != -1) {
			bao.write(data);
		}
		
		outSrc = bao.toByteArray();
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
	}

}
