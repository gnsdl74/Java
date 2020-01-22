package edu.java.homework;

import java.io.Serializable;

public class Student implements Serializable {
	// 매개변수
	private String name;
	private int math;
	private int eng;
	
	// 생성자
	public Student(String name, int math, int eng) {
		this.name = name;
		this.math = math;
		this.eng = eng;
	}
	
	// 메소드
	public void displayInfo() {
		System.out.println("-- 학생 정보--");
		System.out.println("이름 : " + name);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println();
	} // end display()
	
} // end Student
