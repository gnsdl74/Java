package edu.java.exception05;

public class ExMain05 {

	public static void main(String[] args) {
		// 하나의 try 구문에서 여러 개의 catch를 사용하는 방법 1
		try {
			int x = 12345;
			int y = 1;
			int result = x / y;
			System.out.println("result = " + result);

			int[] array = new int[10];
			array[0] = 1000;
			System.out.println("array[0] = " + array[0]);

			String name = null;
			System.out.println("문자열 길이 : " + name.length());
		} catch (ArithmeticException e) {
			System.err.println("산술연산 예외 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 인덱스 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.err.println("예외 : " + e.getMessage());
		}
		// 하나의 try 구문에서 여러 개의 catch를 사용하는 경우,
		// 자식 클래스의 Exception을 먼저 catch 구문에서 사용하고,
		// 가장 마지막에 최상위 부모 클래스인 Exception을 사용해야 함
		
		System.out.println("프로그램 종료");

	} // end main()

} // end ExMain05