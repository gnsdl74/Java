package edu.java.inherit03;

public class Phone {
	// 멤버 변수
	private String phoneNo;
	
	// 생성자를 하나라도 정의한 경우, 자바 컴파일러는 기본생성잘ㄹ 자동으로 만들어주지 않음!
	public Phone(String phoneNo) {
		this.phoneNo = phoneNo;
		System.out.println("Phone(phoneNo) 생성자 호출");
	}

	// getter, setter
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}	// end Phone
