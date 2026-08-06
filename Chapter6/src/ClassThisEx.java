class Car {
	String color;
	String gearType;
	int door;
	
	Car(){}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car car) {
		color = car.color;
		gearType = car.gearType;
		door = car.door;
	}
	
	String info() {
		return String.format("Color: %s, GearType: %s, Door: %d", color, gearType, door);
	}
	
	void printInfo() {
		System.out.println(info());
	}
}

public class ClassThisEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Black", "auto", 4);
		
		Car car3 = new Car(car2);
		
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
	}

}
