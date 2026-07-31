package Chapter4;
import java.util.Scanner;

public class jungol_148 {

//	입력
//	3
//
//	출력
//	# 
//	# # 
//	# # # 
//	  # # 
//	    #
//	입력
//	5
//
//	출력
//	# 
//	# # 
//	# # # 
//	# # # # 
//	# # # # # 
//	  # # # # 
//	    # # # 
//	      # # 
//	        #


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 1; i<cnt; i++) {
			for(int j = cnt; j>cnt-i; j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<cnt; i++) {
			for(int j = cnt; j>cnt-i; j--) {
				System.out.print("  ");
			}
			for(int j = 0; j<cnt-i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
		
	}

}
