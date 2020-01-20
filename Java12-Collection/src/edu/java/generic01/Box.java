package edu.java.generic01;

/*
 *  Generic 클래스
 *  - 클래스의 멤버 변수, 메소드 또는 생성자의 매개변수, 메소드의 리턴 타입 등을
 *    지정하지 않고, 일반적으로 정의하는 클래스
 *  - generic 클래스를 정의할 때 사용되는 일반화 변수(T)는 클래스 타입만 가능
 *    -> 자바의 기본 자료형(int, boolean, double, ...)을 사용할 수 없음
 *    -> 기본 자료형 대신에 wrapper 클래스를 일반화 변수로 사용
 */
public class Box<T> {
	private T content;
	
	public Box(T content) {
		this.content = content;
	}
	
	public T pullOut() {
		return content;
	}
} // end Box<T>
