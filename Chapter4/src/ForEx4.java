
public class ForEx4 {
	public static void main(String[] args) {
		for(int i = 2; i<10; i++) {
			System.out.println("============");
			System.out.println(String.format("    %d 단 ", i));
			System.out.println("============");
			for(int j = 1; j<10; j++) {
				System.out.println(String.format("%d x %d = %d", i, j, i*j));
			}
			System.out.println();
		}
		
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.print(String.format("%d x %d = %d	", j, i, i*j));
			}
			System.out.println();
		}
	}

}
