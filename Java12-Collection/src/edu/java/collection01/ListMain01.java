package edu.java.collection01;

import java.util.ArrayList;

public class ListMain01 {

	public static void main(String[] args) {
		int[] list1 = new int[3];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("리스트 크기 : " + list.size());

		// ArrayList에 원소(element) 추가 : add() 메소드 사용
		list.add(100); // index = 0
		list.add(200); // index = 1
		list.add(300); // index = 2
		list.add(400); // index = 3

		// ArrayList에 있는 원소 참조(읽기) : get(index) 메소드 사용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();

		// for (원소타입 변수이름 : 배열 또는 리스트 이름) {...}
		for (Integer n : list) {
			System.out.println(n);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
		// ArrayList에서 특정 인덱스의 원소를 변경 : set(index, value)
		list.set(0, 1);
		list.set(2, 123456);
		for (Integer n : list) {
			System.out.println(n);
		}

		System.out.println();
		// ArrayList에서 특정 인덱스의 원소를 삭제 : remove(index)
		list.remove(2);
		System.out.println("size = " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	} // end main()

} // end ListMain01
