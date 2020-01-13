package edu.java.access01;

public class AccessMain01 {
	
	public static void main(String[] args) {
		// Test01 클래스의 인스턴스 생성
		Test01 t1 = new Test01();
		t1.display();
//		t1.n1 = 100;	// 컴파일 에러
		// private 멤버 변수는 다른 클래스에서 직접 접근이 불가능(보이지 않음)
		// -> 값을 변경하거나 읽어오지 못함.
		t1.n2 = 200;	// (package) : 같은 패키지에 있기 떄문에 접근 가능
		t1.n3 = 300;	// protected : 같은 패키지에 있기 떄문에 접근 가능
		t1.n4 = 400;	// public : 어디서든지 접근 가능
		t1.display();
		
		
	}	// end main()
	
}	// end AccessMain01
