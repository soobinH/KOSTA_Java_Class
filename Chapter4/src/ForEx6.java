
public class ForEx6 {
	
	public static void print_endline() {
		System.out.println();
		System.out.println("=======================");
		System.out.println();
	}

	public static void main(String[] args) {
//		*****
//		****
//		***
//		**
//		*
		for(int i = 5; i>0; i--) {
			for(int j = 5-i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		print_endline();

		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i = 0; i<5; i++) {
			for(int j = i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 5-i; k>0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		print_endline();

		
//		*
//		**
//		***
//		****
//		*****
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		print_endline();
		
		
//		0123A
//		456BC
//		78DEF
//		9GHIJ
//		KLMNO
		char alphabet = 'A';
		int number = 0;
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print(number);
				number++;
			}
			for(int k = 0; k<i; k++) {
				System.out.print(alphabet);
				alphabet++;
			}
			System.out.println();
		}
		
		print_endline();


	}

}
