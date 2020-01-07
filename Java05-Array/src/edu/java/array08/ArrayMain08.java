package edu.java.array08;

public class ArrayMain08 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		String[] subjects = { "국어", "영어", "수학", "프로그래밍" };
		for (int i = 0; i < subjects.length; i++) {
			System.out.println("과목명 : " + subjects[i]);
			System.out.println("문자열 길이 : " + subjects[i].length());
		}
		
		System.out.println("====================");
		String[] names = new String[3];
		names[0] = "광어";
		names[1] = "우럭";
		names[2] = "대방어";
//		names[3] = "연어";
		
		for(String name : names) {
			System.out.println("문자열 길이 : " + name.length());
		}
		
	} // end main()

} // end ArrayMain08
