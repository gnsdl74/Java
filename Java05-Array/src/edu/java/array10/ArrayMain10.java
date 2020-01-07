package edu.java.array10;

public class ArrayMain10 {

	public static void main(String[] args) {
		System.out.println("2차원 배열 연습");
		String[] avengers = { "아이언맨", "토르", "헐크", "캡틴아메리카" };
		String[] villain = { "타노스", "하이드라", "레드스컬" };
		String[][] characters = { avengers, villain };

		int i = 0, j = 0;
		for (String[] group : characters) { // 2차원 배열 -> 1차원 배열
			j = 0;
			System.out.println(i + "층 group");
			for (String name : group) {
				System.out.print(j + "호 name : ");
				System.out.print(name + " | ");
				j++;
			}
			System.out.println();
			i++;
		}

	} // end main()

} // end ArrayMain10
