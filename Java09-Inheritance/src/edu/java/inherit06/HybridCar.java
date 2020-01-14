package edu.java.inherit06;

public class HybridCar extends Car {
	// 멤버 변수
	private int battery;
	
	// 생성자
	public HybridCar() {}
	public HybridCar(int battery) {
		super();
		this.battery = battery;
	}

	// getter, setter
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	// 메소드
	@Override
	public void display() {
		System.out.println("하이브리드 자동차 연료 : " + getFuel());
		System.out.println("하이브리드 자동차 배터리 : " + battery);
	}
	
}
