package edu.java.generic01;

public class GenericMain01 {

	public static void main(String[] args) {
		Apple apple = new Apple("충주");
		apple.displayAppleType();
		
		AppleBox aBox = new AppleBox(apple);
		aBox.pullOut().displayAppleType();
		
		System.out.println();
		Orange orange = new Orange(12);
		orange.displayOrangeSugar();
		OrangeBox oBox = new OrangeBox(orange);
		oBox.pullOut().displayOrangeSugar();
		
		System.out.println("=======================================");
		// generic 클래스의 Box 인스턴스 생성
		Box<Apple> box1 = new Box<Apple>(apple);
		box1.pullOut().displayAppleType();
		
		Box<Orange> box2 = new Box<Orange>(orange);
		box2.pullOut().displayOrangeSugar();
		
		Box<Integer> box3 = new Box<Integer>(123);
		int a = box3.pullOut().intValue();
		System.out.println(a);
		
	} // end main()

} // end GenericMain01
