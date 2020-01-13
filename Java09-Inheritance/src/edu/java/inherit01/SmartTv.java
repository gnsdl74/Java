package edu.java.inherit01;

// BasicTv : 상위(super) 클래스, 부모(parent) 클래스, 기본(base) 클래스
// SmartTv : 하위(sub) 클래스, 자식(child) 클래스, 유도(derived) 클래스
public class SmartTv extends BasicTv {
	// 멤버 변수
	private String ip;

	// 메소드
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}	// end SmartTv
