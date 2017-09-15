package Lektion.klasser;

public class Circle {
	private double r = 1.0;
	private String color ="blue";
	
	
	/**
	 *  constructor 
	 */
	public Circle(String startcolor) {
		color = startcolor; 
		System.out.println(r + " " + color);
	 
	}
	
	
	
	public double getR() {
		return r; 
	}
	
	public void setR(double newR){
		r=newR; 		
			}
}
