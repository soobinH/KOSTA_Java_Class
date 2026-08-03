
public class ArrayEx3 {

	public static void main(String[] args) {
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int sum = 0;
//		for(int i = 0; i<arr1.length; i++) {
//			sum += arr1[i];
//		}
//		
//		System.out.println(sum);
//		System.out.println((double)sum/arr1.length);
		
		int[] lotto = new int[45];
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		int num_count = 0;
		int temp = 0;
		
		while(true) {
			if(num_count >= 6) break;
			int random_num = (int)(Math.random() * lotto.length-1);
			//System.out.println(random_num);
			if(lotto[random_num] != random_num+1) continue;
			temp = lotto[random_num];
			lotto[random_num]  = lotto[num_count];
			lotto[num_count] = temp;
			System.out.println(lotto[num_count]);
			num_count++;
			
		}
		
		
		
		
		
		
	}

}
