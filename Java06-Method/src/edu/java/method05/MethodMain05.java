package edu.java.method05;

/*
 * 메소드 overloading
 * 1. 매개변수의 개수가 다르거나
 * 2. 매개변수의 타입이 다른 경우
 * 같은 이름으로 메소드를 정의할 수 있음
 * (주의) 메소드의 리턴타입만 다른 경우는 같은 이름으로 메소드를 정의할 수 없음
 */

public class MethodMain05 {

	public static void main(String[] args) {
		sayHello();
		sayHello("감자");
		sayHello(3, "감자");
		sayHello("감자", 5);
		
	}	// end main()
	
	public static void sayHello() {
		System.out.println("안녕하세요");
	}
	
	public static void sayHello(String name) {
		System.out.println("안녕?");
		System.out.println("제 이름은 : " + name + "입니다.");
	}
	
	public static void sayHello(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void sayHello(int age, String name) {
		System.out.println("제 나이는 : " + age);
		System.out.println("제 이름은 : " + name);
	}

}	// end MethodMain05
