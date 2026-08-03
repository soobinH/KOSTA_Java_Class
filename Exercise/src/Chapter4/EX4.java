package Chapter4;

public class EX4 {

	public static void main(String[] args) {
//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//		100이상이 되는지 구하시오.
		
		int sum = 0;
		int i = 1;
		while(sum < 100) {
			if(i % 2 == 0) {
				sum -= i;
				i++;
				continue;
			}
			
			sum += i;
			//System.out.println(i);
			i++;
		}
		
		System.out.println(String.format("sum = %d, i = %d", sum, i-1));
	}

}
