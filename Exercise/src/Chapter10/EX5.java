package Chapter10;

import java.lang.Runnable;

class Outer5 {
	private int instanceVar = 10;
	private static int staticVar = 20;
	
	public Runnable createWorker() {
		int localVar = 30;
		class LocalWorker implements Runnable {

			@Override
			public void run() {
				System.out.println("인스턴스 변수: " + instanceVar);
				System.out.println("static 변수: " + staticVar);
				System.out.println("지역 변수: " + localVar); // local class에서 local 변수는 final만 사용 가능하다
			}
		}
		return new LocalWorker();

	}
}

public class EX5 {

	public static void main(String[] args) {
		Outer5 outer = new Outer5();
		Runnable worker = outer.createWorker();
		worker.run();
	}

}
