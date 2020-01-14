package edu.java.inherit08;

public class Employee {
	// 멤버 변수
	private String name;

	// 생성자
	public Employee(String name) {
		this.name = name;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void test() {
		System.out.println("직원");
	} // end test()

} // end Employee
