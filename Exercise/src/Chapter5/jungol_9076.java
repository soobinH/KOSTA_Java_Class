package Chapter5;

public class jungol_9076 {

	public static void main(String[] args) {
		int[] fibonacci = new int[40];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		
		for(int i = 0; i<fibonacci.length-2; i++) {
			fibonacci[i+2] = fibonacci[i]+fibonacci[i+1];
			
		}
		
		for(int i = 0; i<fibonacci.length; i++)
		{
			if(i % 10 == 9) {
				System.out.println(String.format("피보나치 수열 %d항 : %d", i+1, fibonacci[i]));
			}
		}
	}

}
