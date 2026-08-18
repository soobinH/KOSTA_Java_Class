package Chapter9;

public class EX11 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해 주세요.");
			return;
		}
		
		int dan1 = Integer.parseInt(args[0]);
		int dan2 = Integer.parseInt(args[1]);
		if(dan1<2 || dan1>9 || dan2<2|| dan2>9) {
			System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			System.out.println("USAGE : GugudanTest 3");
			return;
		}
		
		if(dan1>dan2) {
			int tdan = dan1;
			dan1 = dan2;
			dan2 = tdan;
		}
		
		for(int i = dan1; i<=dan2; i++) {
			System.out.println(i+"단");
			for(int j = 1; j<10; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i*j));
			}
			System.out.println();
		}
	}

}
