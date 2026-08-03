package Chapter5;
import java.util.Scanner;
public class jungol_9071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int evenMax = arr[0];
		int oddMin = arr[0];
		
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0 && evenMax < arr[i]) {
				evenMax = arr[i];
			}
			else if(arr[i] % 2 != 0 && oddMin > arr[i]) {
				oddMin = arr[i];
			}
		}
		
		System.out.println(String.format("%d %d", oddMin, evenMax));
	}

}
