
public class StarMain {

	public static void main(String[] args) {
		UnitSet us = new UnitSet();
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		SCV scv = new SCV();
		Dropship dropship = new Dropship();
		Wraith wraith = new Wraith();
		
		us.createUnit(marine);
		us.createUnit(tank);
		us.createUnit(scv);
		us.createUnit(dropship);
		us.createUnit(wraith);

		us.moveAll(100, 234); // 모든 유닛을 이동한다.
		us.allAirUnits(); // 모든 air unit을 출력한다
		us.allGroundUnits();// 모든 groundUnit을 출력한다
		
		us.moveTank(200, 345); // Tank들만 이동한다.
		us.moveDropship(500, 123); // Dropship만이동한다
		us.move(marine, 234, 134); // marine만 이동한다
		
		us.stimPack(); // Marine들만 골라서 stimpack을 실행시킨다
		us.gather(); // scv들만 골라서 gather 기능을 호출한다
		
//		scv.repaire(marine);//
		scv.repaire(tank);
		scv.repaire(scv);

		
		
	}

}
