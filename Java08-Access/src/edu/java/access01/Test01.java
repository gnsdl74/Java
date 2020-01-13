package edu.java.access01;

/*
 *  접근 제한 수식어(Access Modifier)
 *  1. 종류 : private, (package), protected, public
 *  2. 기능 :
 *  	1) 멤버 변수에 대한 접근 권한을 설정
 *  	2) 메소드에 대한 접근 권한을 설정
 *  	3) 생성자에 대한 접근 권한을 설정
 *  	4) 클래스에 대한 접근 권한을 설정(package, public만 사용 가능)
 *  3. 의미 :
 *  	1) private : 선언(정의)된 클래스 안에서만 직접 접근(사용)이 가능
 *  	2) (package) : 같은 패키지에 있는 클래스들에서 직접 접근(사용)이 가능
 *  	3) protected : 같은 패키지에 있거나 상속받는 클래스들에서 직접 접근(사용) 가능
 *  	4) public : 어디서든지 직접 접근(사용) 가능
 *  4. 사용 범위 : private < (package) < protected < public
 */
public class Test01 {	// Test01 클래스는 어디서든 접근 가능
	// 멤버 변수
	private int n1;	// 클래스 내부에서 사용
	int n2;	// (package) 내부에서 사용
	protected int n3;	// 같은 패키지 혹은 상속받은 클래스들에서 사용
	public int n4;	// 어디서든지 사용
	
	// 메소드
	public void display() {
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
	}	// end display()
	
}	// end Test01
