package edu.java.collection04;

public class Score {
	// 멤버 변수 - 영어(eng), 수학(math) 변수 생성
	private int eng;
	private int math;
	
	// 기본 생성자, 매개변수 생성자 작성
	public Score() {}
	public Score(int eng, int math) {
		super();
		this.eng = eng;
		this.math = math;
	}
	
	// getter/setter 작성
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

} // end CollectionMain04
