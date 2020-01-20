package edu.java.collection02;

import java.util.ArrayList;

class Student {
	// 멤버 변수
	private int stuNo;
	private String name;

	public Student(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String str = "번호 : " + stuNo + "\n" + "이름 : " + name;
		return str;
	}

} // end Student

public class ListMain02 {

	public static void main(String[] args) {
		Student[] list1 = new Student[3];
		// Student 타입을 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<Student> list = new ArrayList<Student>();
		// index : 리스트 내부의 접근 번호
		// element : 리스트의 타입에 맞는 객체를 저장

		// 원소 추가 : add(element)
		Student stu1 = new Student(1, "Kim");
		list.add(stu1);
		list.add(new Student(2, "Park"));

		// 원소 읽기 : get(index)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=============================");
		// 원소 변경 : set(index, element)
		list.set(0, new Student(3, "Choi"));
		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println("=============================");
		// 원소 삭제 : remove(index)
		list.remove(0);
		for (Student s : list) {
			System.out.println(s);
		}

	} // end main()

} // end ListMain02
