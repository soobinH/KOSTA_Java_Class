import java.util.Arrays;

interface Compare {
	int compareTo(int x, int y);
}

class IncCompare  implements Compare {
	@Override
	public int compareTo(int x, int y) {
		return x-y;
//		if(x>y) return 1;
//		else if(x<y) return -1;
//		else return 0;
	}
	
}

class DescCompare  implements Compare {
	@Override
	public int compareTo(int x, int y) {
		return y-x;
//		if(x>y) return -1;
//		else if(x<y) return 1;
//		else return 0;
	}
	
}

public class CompareFuncEx1{
	
	static void bubbleSort(int[] arr, Compare com) {
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
			for(int j = 0; j<len-i-1; j++) {
				if(com.compareTo(arr[j], arr[j+1])>0) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {7, 4, 1, 9, 5};
		System.out.println(Arrays.toString(arr));	

		bubbleSort(arr, new IncCompare());
		System.out.println(Arrays.toString(arr));	
		bubbleSort(arr, new DescCompare());
		System.out.println(Arrays.toString(arr));	
		
	}

}
