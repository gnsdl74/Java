package edu.java.access05;

public class AccessMain05 {

	public static void main(String[] args) {

		Point pt1 = new Point();
		System.out.println("(" + pt1.getX() + ", " + pt1.getY() + ")");

		Point pt2 = new Point(3, 4);
		System.out.println("(" + pt2.getX() + ", " + pt2.getY() + ")");
		
		double result = pt1.distance(pt2);
		System.out.println("distance : " + result);

		result = pt2.distance(pt1);
		System.out.println("distance : " + result);

	} // end main()

} // end HomeWork
