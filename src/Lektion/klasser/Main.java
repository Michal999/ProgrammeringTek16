package Lektion.klasser;

public class Main {

	public static void main(String[] args) {
	Car car1 = new Car("V6","Volvo");
	Car car2 = new Car("V4","Honda");
	Car car3 = new Car("V8","Rover");

	car1.setSpeed(240);
	car1.setSpeed(140);
	car1.setSpeed(340);
	
	System.out.println(car1.getSpeed());
	System.out.println(car2.getSpeed());
	System.out.println(car3.getSpeed());

	}
}