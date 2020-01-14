package edu.java.inherit05;

public class Point1 {
	private double x;
	private double y;

	public Point1(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
