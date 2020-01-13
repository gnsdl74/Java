package edu.java.inherit03;

public class SmartPhone extends Phone {
	private String ip;
	
	/*
	 * 생성자
	 * - 자식 클래스의 생성자가 호출되면,
	 *   부모 크래스의 생성자가 먼저 실행된 후, 자식 클래스의 코드들이 실행됨
	 *   1) 부모 클래스의 생성자를 명시적으로 호출하지 않을 때는 super()가 자동으로 호출
	 *   2) 부모 클래스의 생성자를 명시적으로 super(); 또는 super(매개변수); 로 호출 가능
	 * - 만약에 부모 클래스가 기본 생성자를 가지고 있지 않은 경우에는
	 *   super()가 자동으로 호출될 수 없기 때문에,
	 *   자식 클래스의 생성자에서 super(매개변수) 호출하는 코드가 반드시 있어야 함
	 */
	
	public SmartPhone() {
		super(null);
		System.out.println("SmartPhone 생성자 호출");
	}

	public SmartPhone(String phoneNo) {
		super(phoneNo);
		System.out.println("SmartPhone(phoneNo) 생성자 호출");
	}

	public SmartPhone(String phoneNo, String ip) {
		super(phoneNo);
		this.ip = ip;
		System.out.println("SmartPhone(phoneNo, ip) 생성자 호출");

	}

	// getter, setter
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

} // end SmartPhone
