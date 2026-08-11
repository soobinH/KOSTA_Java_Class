
public class ExceptionEx4 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = {4, 5, 0};

		for(int i = 0; i<arr1.length; i++) {
			try {
					System.out.println(arr1[i]/arr2[i]);
			}
			catch(ArithmeticException e)  {
					System.out.println(arr1[i]);	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(0);
			}
		}
	}
}


