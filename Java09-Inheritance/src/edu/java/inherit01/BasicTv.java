package edu.java.inherit01;

public class BasicTv {
	// 멤버 변수(필드, 프로퍼티)
	private boolean powerOn;
	private int channel;
	private int volume;
	
	// 생성자
	public BasicTv() {}
	
	// 메소드
	public void turnOnOff() {
		if(powerOn) {
			powerOn = false;
			System.out.println("TV OFF");
		} else {
			powerOn = true;
			System.out.println("TV ON");
		}
	}
}	// end BasicTv
