package Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_564 {
	public static void main(String[] args) throws IOException {
		int[] count = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄을 통째로 읽어온 뒤, 공백(스페이스)을 기준으로 단어를 분리합니다.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 자른 단어가 남아있는 동안 반복합니다.
		while(st.hasMoreTokens()) {
			// 공백으로 구분된 다음 문자열을 가져와서 첫 번째 글자를 추출
			char input = st.nextToken().charAt(0);
			
			if(input > 'Z' || input < 'A') break;
			count[input - 'A']++;
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0)
				System.out.println(String.format("%c : %d", i + 'A', count[i]));
		}
	}
}