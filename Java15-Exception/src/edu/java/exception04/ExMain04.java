package edu.java.exception04;

public class ExMain04 {

	public static void main(String[] args) {
		try {
			System.out.println("try 내부");
			String name = null;
			System.out.println("문자열 길이 : " + name.length());
		} catch (NullPointerException e) {
			System.err.println("예외 메시지 : " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	} // end main()

} // end ExMain04
