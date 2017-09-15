package Lektion.klasser;

public class TestCricle {

	public static void main(String[] args) {
	
		Circle newCircle = new Circle("red");
		
		System.out.println(newCircle.getR());	
	
		newCircle.setR(20.56);
		
		System.out.println(newCircle.getR());
		
	}
	
}
