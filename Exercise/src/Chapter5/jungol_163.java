package Chapter5;

public class jungol_163 {

	public static void main(String[] args) {
		int[][] arr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
				total += arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println(total);
		
		
	}

}
