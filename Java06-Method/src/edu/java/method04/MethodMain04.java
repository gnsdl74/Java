package edu.java.method04;

//import java.util.Arrays;
import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		// 배열을 매개변수로 갖는 메소드

		// 정수(int) 5개를 저장할 수 있는 배열 선언
		int[] scores = new int[5];

		inputScores(scores);
		System.out.println();
		printScores(scores);
		System.out.println();

		// 배열에 저장된 점수들의 총합을 출력(메소드 사용)
		int total = calcTotal(scores);
		System.out.println("합계 : " + total);

		// 배열의 값 중에 최대 값을 출력(메소드 사용)
		int max = findMax(scores);
		System.out.println("최대값 : " + max);

	} // end main()

	// 배열의 값 중에 최대 값을 찾는 메소드
	private static int findMax(int[] scores) {
//		Arrays.sort(scores);
		// 정렬하는 방법은 배열의 원소가 많아질 수 록 시간이 오래걸림.
//		return scores[scores.length-1];

		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}	// end findMax()

	// 배열에 있는 점수를 모두 더하는 메소드
	private static int calcTotal(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	} // end calcTotal()

	// 배열에 점수를 저장하는 메소드 생성
	private static void inputScores(int[] scores) {
		Scanner sc = new Scanner(System.in);
		// 주소값이 동일하기 때문에 main에 있는 scores배열에 값을 저장하는 것과 같음
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수" + i + ">");
			scores[i] = sc.nextInt();
		}
		sc.close();
	} // end inputScores()

	// 배열에 있는 점수를 출력하는 메소드
	private static void printScores(int[] scores) {
		for (int x : scores) {
			System.out.println(x);
		}
	} // end printScores()

} // end MethodMain04
