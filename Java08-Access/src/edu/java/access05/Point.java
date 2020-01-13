package edu.java.access05;

public class Point {
	// 매개 변수
	private double x;
	private double y;

	// Constructor
	public Point() {
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	} // end Constructor

	// getter, setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	// end getter, setter

	// 메소드
	public double distance(Point pt) {
		double result = 0;
		double disX = x - pt.x;
		double disY = y - pt.y;
		result = Math.sqrt(disX * disX + disY * disY);

		return result;
	}

}
