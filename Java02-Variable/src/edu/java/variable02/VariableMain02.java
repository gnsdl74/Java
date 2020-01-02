package edu.java.variable02;

public class VariableMain02 {

	public static void main(String[] args) {
		System.out.println("---변수 선언, 초기화 연습---");
		
		// 1. 국어, 영어, 수학 점수 변수 선언
		int kor, eng, math;
		
		// 2. 각 점수 저장
		kor = 90; eng = 80; math = 70;
		
		// 3. 각 점수 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		
		// 4. 각 점수의 합(변수 선언해서 저장 및 출력)
		int total = kor+eng+math;
		System.out.println("점수의 합 : " + total);
		
		// 5. 점수의 평균 변수 선언 및 저장, 출력
		int avg = total/3;
		System.out.println("점수의 평균 : " + avg);
		
	}	// end main()           

}	// end VariableMain02
