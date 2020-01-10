package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		
		MyCircle cir1 = new MyCircle();
		cir1.setRadius(5);
		double result = cir1.calcCircle();
		System.out.println("cir1의 반지름 : " + cir1.getRadius());
		System.out.println("cir1의 면적 : " + result);
		System.out.println("=======================");
		
		MyCircle cir2 = new MyCircle(2.5);
		result = cir2.calcCircle();
		System.out.println("cir2의 반지름 : " + cir2.getRadius());
		System.out.println("cir2의 면적 : " + result);
		
	}	// end main()

}	// end ClassMain03
