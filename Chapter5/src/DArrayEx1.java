
public class DArrayEx1 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100,100},
				{90,90,90},
				{80,80, 80},
				{70, 70, 70},
				{60, 60, 60}
		};
		
//		System.out.println(score.length);
//		System.out.println(score[0].length);
		
		for(int i = 0; i<score.length; i++)
		{
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
