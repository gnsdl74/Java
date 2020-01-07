package edu.java.array09;

public class ArrayMain09 {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		// 2차원 배열 : 1차원 배열을 원소로 갖는 배열
		int[] korean = { 10, 20, 30 }; // 1차원 배열
		int[] english = { 40, 50, 60 }; // 1차원 배열
		System.out.println(korean);
		System.out.println(english);
		
		int[][] scores = { { 10, 20, 30 }, { 40, 50, 60 } }; // 2 x 3인 2차원 배열

		System.out.println(scores[1][1]); // 1층 1호
		System.out.println(scores[0][2]); // 0층 2호
		System.out.println(scores.length); // 층의 길이(층의 개수)
		System.out.println(scores[0].length); // 0층의 길이(호의 개수)
		System.out.println();

		// i, j 쌍
		// - (0, 0), (0, 1), (0, 2)
		// - (1, 0), (1, 1), (1, 2)
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("========================");
		int[][] array = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		System.out.println(array[1][1]);
		System.out.println(array.length);
		System.out.println(array[0].length);

		// 중첩 for문 이용, array의 모든 값 출력
		System.out.println("========================");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int[][] a = new int[2][2];	// 2x2 배열 생성
		// 배열이 생성되면서 특정 주소값을 갖음
		System.out.println(a);
		
		System.out.println("========================");
		
		String[] test1 = {"안녕"};
		System.out.println("test1의 주소값 : " + test1);
		String[] test2 = {"안녕"};
		System.out.println("test2의 주소값 : " + test2);
		
		
		
		

	} // end main()

} // end ArrayMain09
