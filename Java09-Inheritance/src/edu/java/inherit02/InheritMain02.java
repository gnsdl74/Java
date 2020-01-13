package edu.java.inherit02;

public class InheritMain02 {

	public static void main(String[] args) {
		// Person 클래스의 인스턴스 생성
		Person p1 = new Person();
		System.out.println(p1);
		
		System.out.println("====================================");
		// BusinessPerson 클래스의 인스턴스 생성
		BusinessPerson p2 = new BusinessPerson();
		
		System.out.println("====================================");
		BusinessPerson p3 = new BusinessPerson("Wak", "Do");
		
	}	// end main()

}	// end InheritMain02
