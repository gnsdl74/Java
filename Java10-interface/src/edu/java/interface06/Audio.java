package edu.java.interface06;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio 켜짐");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio 꺼짐");

	}

} // end Audio
