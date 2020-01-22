package edu.java.exception06;

public class ExMain06 {

	public static void main(String[] args) {
		/*
		 * 하나의 try 구문에서 여러 개의 catch를 사용하는 방법2 : Java 7버전부터
		 * try {
		 *    정상 상황일 때 실행할 코드;
		 * } catch (Ex1 | Ex2 | Ex3 ... e) {
		 *    예외 상활일 때 실행할 코드;
		 * } catch (Exception e) { ... } 
		 * 예외(Exception)의 종류들을 나열할 때는 부모 예외 클래스가 포함되면 안됨  
		 * 최상위 예외 클래스(Exception)은 항상 마지막에 catch 구문에서만 사용
		 */
		try {
			System.out.println("try 시작");
			int result = 123 / 10;
			int[] array = new int[10];
			array[10] = 10;
			System.out.println("try 끝");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println("예외 : " + e.getMessage());
		} catch (Exception e) {
			System.err.println("예외 : " + e.getMessage());
		}
		System.out.println("프로그램 종료");
		
	} // end main()

} // end ExMain06
