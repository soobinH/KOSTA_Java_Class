package Chapter5;

public class jungol_567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{5, 8,10,6, 4},
				{11, 20, 1, 13, 2},
				{7,9, 14, 22, 3}};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(String.format("%2d   ", arr[i][j]));
			}
			System.out.println();
		}

	}

}
