package edu.java.homework01;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		System.out.print("password 입력 : ");
		String password = sc.nextLine();
		sc.close();
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}	// end main()

}	// MemberServiceExample
