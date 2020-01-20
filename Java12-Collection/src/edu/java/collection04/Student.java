package edu.java.collection04;

public class Student {
	// 멤버 변수 - 이름(name), 점수(score)
	private String name;
	private Score score;
	
	// 기본 생성자, 매개변수 생성자
	public Student() {}
	public Student(String name, Score score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	// 메소드
	@Override
	public String toString() {
		String str = "이름 : " + name + "\n"
				+ "수학 : " + score.getMath() + "\n" 
				+ "영어 : " + score.getEng() + "\n";
		return str;
	}
} // end Student
