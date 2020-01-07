package edu.java.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		System.out.println("배열 연습");

		// char 26개를 저장할 수 있는 배열 alphas 선언
		char[] alphas = new char[26];

		// for문을 사용하여 'a' ~ 'z'까지 저장
		for (int i = 0; i < alphas.length; i++) {
			alphas[i] = (char) ('a' + i);
		}

		// for-each로 출력
		for(char ch : alphas) {
			System.out.println(ch);
		}
		
		for(char ch = 'a'; ch <= 'z' ; ch++) {
			alphas[ch-'a'] = ch;	// ch-ch : alphas[0]에만 저장됨
		}
		
		
		
	} // end main()

} // end ArrayMain06
