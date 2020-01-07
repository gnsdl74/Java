package edu.java.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		// boolean 타입을 저장할 수 있는 배열 선언
		// 배열에 {true, false, true, false}를 저장
		boolean[] arr1 = { true, false, true, false };
		for (boolean b : arr1) {
			System.out.println(b);
		}

		System.out.println("===============");
		boolean[] arr2 = new boolean[4];
		for (int i = 0; i < arr2.length; i++) {
			// i가 짝수면 arr2[i]에 true 저장
			if (i % 2 == 0) {
				arr2[i] = true;
			} else {	// i가 홀수면 arr2[i]에 false 저장
				arr2[i] = false;
			}
		}
		
		for(boolean b : arr2) {
			System.out.println(b);
		}

	} // end main()

} // end ArrayMain07
