package edu.java.inherit06;

public class InheritMain06 {

	public static void main(String[] args) {
		// Car 쿨래스의 인스턴스 생성
		Car car1 = new Car();
		
		// HybridCar 클래스의 인스턴스 생성
		HybridCar car2 = new HybridCar();
		
		Car car3 = new HybridCar();	// 다형성(polymorphism)
//		HybridCar car4 = new Car();	// 자식 클래스에 부모 클래스 객체 저장 불가능
		// Child 변수 이름 = new Child(); - 가능
		// Parent 변수이름 = new Child(); - 가능
		// Child 변수이름 = new Parent(); - 불가능
		
		// Car 타입 배열 선언
		Car[] cars = new Car[3];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		for(Car x : cars) {
			x.display();
			System.out.println("-----------------------------------");
		}
	}	// end main()

}	// end InheritMain06
