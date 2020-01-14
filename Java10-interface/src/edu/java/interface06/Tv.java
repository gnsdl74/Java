package edu.java.interface06;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 켜짐");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 꺼짐");

	}
} // end Tv
