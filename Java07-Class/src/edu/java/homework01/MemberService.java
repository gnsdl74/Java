package edu.java.homework01;

public class MemberService {
	String id;
	String password;
	
	public MemberService() {}
	public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public boolean login(String id, String password) {
		boolean check = false;
		if(id.equals("hong") && password.equals("12345")) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}	// end login()
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}	// end MemberService
