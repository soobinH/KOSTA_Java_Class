package Chapter7;

public class EX18 {
	
	static void action(Robot arr) {
		if(arr instanceof DanceRobot) ((DanceRobot) arr).dance();
		else if(arr instanceof SingRobot) ((SingRobot) arr).sing();
		else if(arr instanceof DrawRobot) ((DrawRobot) arr).draw();
		
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);

	}

}

class Robot{}
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}