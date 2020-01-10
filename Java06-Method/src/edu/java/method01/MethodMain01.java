package edu.java.method01;

/*
 * 메소드 : 기능을 수행하기 위한 코드
 * - 메소드는 클래스 안에서, 다른 메소드 외부에서 만든다(정의)
 * - (주의) 메소드 안에 또다른 메소드를 만들 수 없음
 * - 메소드 정의 :
 *   [수식어] 리턴타입 메소드이름([매개변수1, 매개변수2, ..]) { 본문 }
 *     수식어 : public, private, static, ... - 생략 가능
 *     리턴타입 : 자료타입(int, double, String, Class, ...), void(없음)
 *     매개변수 : 메소드를 호출할 때 전달하는 데이터
 *             전달받는 데이터가 없으면 매개변수 선언이 없어도 됨.
 *             ()는 생략할 수 없음
 *     {...} : 메소드 본체(body)
 */

public class MethodMain01 {
	
	// 메소드
	public static void sayHello(String name) {	// name = "배고파" 저장
		System.out.println("안녕하세요~");
		System.out.println("저는 " + name + "입니다!");	// "배고파" 출력
	}	// end sayHello()
	
	public static void sayAge(int age) {
		System.out.println("제 나이는 " + age + "입니다!");
	}	// end sayAge()
	
	// static : 프로그램이 실행될 때 생성하도록 선언하는 키워드
	// static 메소드에서는 static으로 선언된 메소드만 호출 가능
	public static void main(String[] args) {
		System.out.println("안녕하세요~");
		System.out.println("저는 배고파입니다!");
		
		sayHello("배고파");	// 메소드 호출, 인자값으로 "배고파"를 넘겨줌
		sayHello("점심시간");
		
		sayAge(27);
		
	}	// end main()

}	// end MethodMain01

