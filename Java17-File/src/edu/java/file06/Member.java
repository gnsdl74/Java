package edu.java.file06;

import java.io.Serializable;

/*
 *  객체(Object) 타입을 파일에 쓰거나, 파일에서 읽어오고 싶을 때
 *  Serializable 인터페이스를 구현하는 클래스로 선언하면 됨
 *  구현해야 할 추상 메소드는 없기 때문에
 *  implements Serializable 만 추가해주면 됨
 */

public class Member implements Serializable {
	private int no;
	private String id;
	private String pw;
	
	public Member(int no, String id, String pw) {
		this.no = no;
		this.id = id;
		this.pw = pw;
	}
	
	public void displayInfo() {
		System.out.println("-- 회원 정보 --");
		System.out.println("번호 : " + no);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	} // end displayInfo()
} // end Member
