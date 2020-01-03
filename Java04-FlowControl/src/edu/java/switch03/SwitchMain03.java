package edu.java.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		System.out.println("switch문 연습");

		String position = "우수 회원";

		switch (position) {
		case "우수 회원":
			System.out.println("사은품 2개");
			break;
		case "일반 회원":
			System.out.println("사은품 2개");
			break;
		default:
			System.out.println("손님");
			break;
		}

	} // end main()

} // SwitchMain03
