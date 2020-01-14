package edu.java.interface03;

// 클래스는 다중 상속이 불가능하지만, 인터페이스는 여러 개를 구현(상속)하는 것이 가능
interface Test1 {
	public abstract void test1();
} // end Test1

interface Test2 {
	public abstract void test2();
} // end Test2

class TestImple implements Test1, Test2 {

	@Override
	public void test1() {
		System.out.println("테스트1");
	}

	@Override
	public void test2() {
		System.out.println("테스트2");
	}

} // end TestImple

public class InterfaceMain03 {

	public static void main(String[] args) {
		TestImple imple1 = new TestImple();
		imple1.test1();
		imple1.test2();
		
		// 다형성
		Test1 imple2 = new TestImple();
		imple2.test1();
		((Test2) imple2).test2();
		// 변수를 Test1로 선언했기 때문에 Test2의 메소드는 사용할 수 없음
		// Test2의 메소드를 사용하기 위해서는 강제 형변환(casting)을 하면 됨

	} // end main()

} // end InterfaceMain03
