package edu.java.class02;

// 같은 패키지에 포함된 클래스는 import 없이 사용 가능
// java.lang 패키지에 포함된 클래스는 import없이 사용 가능(String, ...)

public class ClassMain02 {
	public static void main(String[] args) {
		// 기본 생성자를 사용하여 MyRectangle 클래스의 인스턴스 생성
		MyRectangle rect1 = new MyRectangle();
		rect1.width = 3.0;
		rect1.height = 4.0;
		System.out.println("가로 : " + rect1.width);
		System.out.println("세로 : " + rect1.height);
		System.out.println("넓이 : " + rect1.calcArea());

		System.out.println("=====================================");
		// 매개변수가 있는 생성자를 호출해서 객체(인스턴스) 생성
		MyRectangle rect2 = new MyRectangle(10.0, 20.0);
		System.out.println("가로 : " + rect2.width);
		System.out.println("세로 : " + rect2.height);
		System.out.println("넓이 : " + rect2.calcArea());
		
	} // end main()
	
}	// end ClassMain02
