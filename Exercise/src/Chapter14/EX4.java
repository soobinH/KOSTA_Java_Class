package Chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class EX4 {

	public static void main(String[] args) {

			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ...");
		
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		Vector<FileInputStream> vector = new Vector<>();
	
		
		try {
			for(int i= 1; i<args.length; i++) {
				vector.add(new FileInputStream(args[i]));
			}
			
			
			sis = new SequenceInputStream(vector.elements());
			fos = new FileOutputStream(args[0]);
			
			byte[] buff = new byte[1024];
			int len = 0;
			while((len = sis.read(buff))>0) {
				fos.write(buff, 0, len);
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis!=null) sis.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
