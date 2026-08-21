package Chapter14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EX1 {

	public static void main(String[] args) {
        // 1. 매개변수 개수 체크
        if (args.length < 2) {
            System.out.println("USAGE: java FileHead 10 FILENAME");
            System.exit(0);
        }

        try {
            int lineNum = Integer.parseInt(args[0]);
            String fileName = args[1];

            File file = new File(fileName);

            // 2. 파일 존재 여부 및 디렉토리 여부 체크
            if (!file.exists() || file.isDirectory()) {
                System.out.println(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
                return;
            }

            // 3. 파일 읽기 및 입력받은 줄 수만큼 출력
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int i = 1;

            while ((line = br.readLine()) != null && i <= lineNum) {
                System.out.println(i + ":" + line);
                i++;
            }

            br.close();
        } catch (NumberFormatException e) {
            System.out.println("첫 번째 인자는 숫자여야 합니다.");
        } catch (FileNotFoundException e) {
            System.out.println(args[1] + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
        } catch (Exception e) {
            System.out.println("에러가 발생했습니다 : " + e.getMessage());
        }
    }

}
