package edu.java.class03;

public class MyCircle {
	
	private double radius;
	
	public MyCircle() {}
	
	public MyCircle(double radius) {
		setRadius(radius);
	}
	
	public void setRadius(double radius) {
		this.radius = radius;	// this : 자기자신(MyCircle 클래스)
	}	// end setRadius()
	
	public double getRadius() {	return radius; }
	// end getRadius()
	
	public double calcCircle() {
		double result=0;
		result = 3.14*radius*radius;
		return result;
	} // end calcCircle()
	
}	// end MyCircle
