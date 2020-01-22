package edu.java.inner07;

interface Hello {
	public abstract void hello();

} // end Hello

class Person implements Hello {
	@Override
	public void hello() {
		System.out.println("안녕?");
	}
} // end Person

class Dog implements Hello {
	@Override
	public void hello() {
		System.out.println("멍멍");
	}
} // end Dog

public class InnerMain07 {

	public static void main(String[] args) {
		// Hello interface는 Person, Dog의 클래스를 모두 받을 수 있음
		// 인스턴스만 다르게 생성하면 모두 사용 가능
		Person p1 = new Person();
		p1.hello();

		Hello p2 = new Person(); // 다형성
		p2.hello();

		Hello dog = new Dog();
		dog.hello();

		// 익명 클래스
		// 본래 인터페이스는 홀로 인스턴스를 생성하지 못하나, 익명 클래스로 사용 가능
		// 원하는 클래스가 없는 경우, 익명 클래스를 이용하여 해당 인터페이스를 오버라이딩하면서 인스턴스 생성
		Hello cat = new Hello() {
			@Override
			public void hello() {
				System.out.println("야옹");
			}
		};
		cat.hello();
		
		Hello father = new Hello() {
			@Override
			public void hello() {
				System.out.println("안녕하세요.");
			}
		};
		// new Hello() { 본체 }
		// 본체 : Hello interface를 구현하는 클래스의 내용(객체)
		father.hello();
		
	} // end main()

} // end InnerMain07
