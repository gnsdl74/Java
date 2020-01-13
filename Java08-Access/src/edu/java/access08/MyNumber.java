package edu.java.access08;

public class MyNumber {
	// 멤버 변수
	private int data;

	// 생성자
	public MyNumber() {}
	public MyNumber(int data) {
		this.data = data;
	}

	// getter/setter
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	// public으로 함수 선언
	// 리턴 타입 : MyNumber
	// 함수이름 : add
	// 매개변수 : MyNumber number
	// 기능 : 현재 객체의 data와 매개변수에 있는 data를 더한 후
	// MyNumber 객체를 리턴하는 메소드
	public MyNumber add(MyNumber number) {
		this.data = this.data + number.data;
		return this;
	}

} // end MyNumber
