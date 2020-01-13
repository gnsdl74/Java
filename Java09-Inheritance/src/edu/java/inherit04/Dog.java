package edu.java.inherit04;

public class Dog extends Animal {
	// 멤버 변수
	private String type;
	
	// 생성자 Overloading(중복)
	public Dog() {}
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	// 메소드 재정의(Override)
	// - 부모 클래스가 가지고 있는 메소드를 자식 클래스에서 재정의(다시 정의)
	// - 메소드의 리턴 타입, 이름, 매개변수 모두 일치해야 함.
	@Override	// annotation(어노테이션)
	public void speak() {
		System.out.println("멍멍!!");
	}
	
	// 메소드 오버로딩(Overloading)
	// - 매개 변수가 다른 메소드를 여러 개 정의하는 것
	public void speak(String str) {
		System.out.println(str);
	}
	
}	// end Dog
