package edu.java.array11;

import java.util.Scanner;

public class ArrayMain11 {
	public static Scanner sc;

	public static void main(String[] args) {
		System.out.println("배열 연습");
		sc = new Scanner(System.in);
		int[] integer = new int[4];
		for (int i = 0; i < integer.length; i++) {
//			integer[i] = sc.nextInt();
			System.out.println(integer[i]);
		}
		sc.close();

		System.out.println("짝수 인덱스의 배열 출력");
		for (int i = 0; i < integer.length; i += 2) {
			System.out.println(integer[i]);
		}

		System.out.println("================");
		String[] str = { "사과", "배", "바나나", "당근" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i].concat(" 팝니다.")); // String.concat(str) : 문자열 끝에 str을 돌려준다.
		}

		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("배")) {
				System.out.println("배를 찾았습니다!");
			}
		}
		
		Contact contact = new Contact("tlqkf");
		System.out.println(contact.getName());
		Contact[] list = new Contact[4];
		for(int i=0; i<list.length; i++) {
			list[i] = contact;
			System.out.println(list[i].getName());
		}
		
	} // end main()

} // end ArrayMain11
