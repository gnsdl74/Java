package edu.java.homework;

import java.io.*;

public class TestMain {

	public static void main(String[] args) {
		BufferedReader br = null;

		InputStream in = null;
		ObjectInputStream oin = null;
		OutputStream out = null;
		ObjectOutputStream oout = null;

		try {
			// BufferedReader로 입력받기
			br = new BufferedReader(new InputStreamReader(System.in));
			
			// 입력받은 정보를 파일에 저장
			out = new FileOutputStream("temp/student.txt");
			oout = new ObjectOutputStream(out);
			Student stu = null;
			
			while (true) {
				System.out.println("0.종료 | 1.점수 입력");
				int choice = Integer.parseInt(br.readLine());
				
				if(choice != 0) {
				System.out.println("이름 입력 : ");
				String name = br.readLine();
				System.out.println("수학 점수 입력 : ");
				int math = Integer.parseInt(br.readLine());
				System.out.println("영어 점수 입력 : ");
				int eng = Integer.parseInt(br.readLine());

				stu = new Student(name, math, eng);
				oout.writeObject(stu);

				System.out.println("파일 저장 성공!");
				} else {
					break;
				}
			} // end while, student 파일에 학생정보 저장
			
			// 파일 정보 읽어와서 출력
			System.out.println();
			in = new FileInputStream("temp/student.txt");
			oin = new ObjectInputStream(in);

			while (true) {
				try {
					stu = (Student) oin.readObject();
					stu.displayInfo();

				} catch (Exception e) {
					break;
				}
			} // end while, student 파일의 학생 정보 출력
			System.out.println("파일 끝까지 읽음!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				oout.close();
				oin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // end entire try-catch-finally

	} // end main()

} // end TestMain
