package edu.java.method02;

public class MethodMain02 {

	// 메소드 이름 : add
	// 기능 : 두 개의 정수를 매개변수로 전달받아서, 두 정수의 합을 리턴
	// 리턴타입 : int
	// 매개변수 : int x, int y
	public static int add(int x, int y) {
		// int sum = x + y;

		return x + y;
	}	// end add()

	// 메소드 이름 : sub
	// 기능 : 두 개의 정수를 매개변수로 전달받아서, 두 정수의 차를 리턴
	// 리턴타입 : int
	// 매개변수 : int x, int y
	public static int sub(int x, int y) {

		return x - y;
	}	// end sub()

	// 메소드 이름 : mul
	// 기능 : 두 개의 실수(Double)를 매개변수로 전달받아서, 두 정수의 곱을 리턴
	// 리턴타입 : double
	// 매개변수 : double x, double y
	public static double mul(double x, double y) {

		return x * y;
	}	// end mul()

	// 메소드 이름 : div
	// 기능 : 두 개의 실수(double)을 전달받아서, 나눈 값을 리턴
	// 리턴타입 : double
	// 매개 변수 : double x, double y
	public static double div(double x, double y) {

		return x / y;
	}	// end div()

	public static void main(String[] args) {
		System.out.println("메소드 연습");

		int result = add(4, 6);
		System.out.println("result = " + result);

		result = sub(10, 6);
		System.out.println("result = " + result);

		double result2;
		result2 = mul(1.4, 2.14);
		System.out.println("mul = " + String.format("%.3f", result2));
		
		result2 = div(1.5, 1.4);
		System.out.println("div = " + String.format("%.3f", result2));
		
		
	} // end main()

} // end MethodMain02
