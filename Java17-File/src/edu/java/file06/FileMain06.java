package edu.java.file06;

import java.io.*;

// 프로그램 ==> ObjectOutputStream ==> FileOutputStream ==> 파일(HDD)

// ObjectOutputStream에서 사용되는 객체는
// Serializable 인터페이스를 구현하고 있어야 함.

public class FileMain06 {

	public static void main(String[] args) {
		OutputStream out = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("temp/member.txt");
			oout = new ObjectOutputStream(out);
			
			Member m1 = new Member(1, "root", "root1234");
			oout.writeObject(m1);
			
			Member m2 = new Member(2, "root2", "root1234");
			oout.writeObject(m2);
			
			Member m3 = new Member(3, "root3", "root1234");
			oout.writeObject(m3);
			
			System.out.println("파일 저장 성공!");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				// 리소스(oout)를 해제 할 때는 최종적으로 생성된 리소스만 해제하면,
				// 그 리소스(oout)가 사용하고 있던 다른 리소스(out)들도 순차적으로 해제됨.
				oout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} // end main()

} // end FileMain06
