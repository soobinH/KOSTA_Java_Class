package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX10 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		int[][] board = new int[5][5];
		
		while(set.size() < 25) {
            set.add((int)(Math.random() * 30) + 1);
        }
		
		Iterator<Integer> it = set.iterator();
		for(int i=0; i < board.length; i++) {
			for(int j=0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		} 


	}

}
