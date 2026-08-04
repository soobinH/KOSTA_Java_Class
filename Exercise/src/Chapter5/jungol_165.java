package Chapter5;

public class jungol_165 {

	public static void main(String[] args) {
		int[][] arr = {{1, 0, 1, 0, 1},
				{0, 0, 0, 0,0},
				{0, 0, 0, 0,0},
				{0, 0, 0, 0,0},
				{0, 0, 0, 0,0},
				};
		
		for(int i = 1; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(j == 0) arr[i][j] = arr[i-1][j+1];
				else if(j == arr[i].length-1) arr[i][j] = arr[i-1][j-1];
				else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
