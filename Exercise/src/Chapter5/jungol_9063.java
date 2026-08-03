package Chapter5;
import java.util.Scanner;
public class jungol_9063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		int[] arr= new int[5];
		
		// System.out.println(input);
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
