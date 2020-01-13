package edu.java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		Contact c1 = new Contact("광어", "010-1234-5678", "good@naver.com");
		c1.displayInfo();
		
		System.out.println();
		
		Contact c2 = new Contact();
		// 본인이 좋아하는 연예인의 이름, 전화번호, 이메일을 넣어서
		// displayInfo()로 출력해주세요.
		c2.setName("우럭");
		c2.setPhone("010-3333-7777");
		c2.setEmail("luck@gmail.com");
		c2.displayInfo();
		
	}	// end main()

}	// end AccessMain04
