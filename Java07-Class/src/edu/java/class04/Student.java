package edu.java.class04;

public class Student {
	// 멤버 변수(필드, 프로퍼티)
	int stuNo;	// 학생 번호
	String name;	// 학생 이름
	Score score;	// 학생의 점수
	
	// 매개 변수가 있는 생성자를 만들면
	// 기본생성자는 생략해도 됨
	public Student(int stuNo, String name, Score score) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}
	
	// 출력 메소드
	public void displayStudentInfo() {
		System.out.println("--- 학생 정보 ---");
		System.out.println("번호 : " + stuNo);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + score.kor + ", 영어 : " + score.eng + ", 수학 : " + score.math);
		System.out.println("총점 : " + score.calcTotal());
		System.out.println("평균 : " + String.format("%.2f", score.calcAverage()));
	}	// end displayStudentInfo()
	
}	// end Student
