package edu.java.inherit05;

public class InheritMain05 {

	public static void main(String[] args) {
		String str = new String("문자열");
		System.out.println(str);
		
		System.out.println();
		Person p1 = new Person("구트");
		System.out.println(p1);
		
		// Point 클래스 생성
		// 멤버 변수(double x, double y)
		// 매개변수 생성자 Point(double x, double y)
		// toString 오버라이딩해서 (x,y) 형식의 문자열을 리턴하는
		// 메소드를 완성하세요.
		// 예시) (1, 2) or (3, 4)
		System.out.println(new Point1(1, 1));
		
		
	}

}
