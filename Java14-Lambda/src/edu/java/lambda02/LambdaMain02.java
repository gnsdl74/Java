package edu.java.lambda02;

@FunctionalInterface
interface Test1 {
	public abstract void testPrint();
} // end Test1

@FunctionalInterface
interface Test2 {
	public abstract void testPrint(int n);
} // end Test2

public class LambdaMain02 {

	public static void main(String[] args) {
		// 익명클래스, 람다 표현식 연습
		// 람다(lambda) 표현식 : 
		// (매개변수1, 매개변수2, ...) -> { 실행문; 리턴; }
		// 인터페이스 변수 이름 = 람다 표현식;
		
		// "익명 클래스 연습!"을 출력하는 익명 클래스 생성 및 출력하기.
		Test1 test1 = new Test1() {

			@Override
			public void testPrint() {
				System.out.println("익명 클래스 연습!");
			}
		};
		test1.testPrint();
		
		// "람다 표현식 연습!"을 출력하는 람다 표현식 생성 및 출력하기.
		System.out.println();
		Test1 test2 = () -> System.out.println("람다 표현식 연습!");
		test2.testPrint();
		
		// "입력한 숫자는 : 100"을 출력하는 익명 클래스 생성 및 출력하기.
		System.out.println();
		Test2 test3 = new Test2() {
			
			@Override
			public void testPrint(int n) {
				System.out.println("입력한 숫자는 : " + n);
			}
		};
		test3.testPrint(100);
		
		// "입력한 숫자는 : 200"을 출력하는 람다 표현식 생성 및 출력하기.
		System.out.println();
		Test2 test4 = (n) -> System.out.println("입력한 숫자는 : " + n);
		test4.testPrint(200);
		
	} // end main()

} // end LambdaMain02
