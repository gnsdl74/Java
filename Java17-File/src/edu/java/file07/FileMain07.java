package edu.java.file07;

import java.io.*;

import edu.java.file06.Member;

// 프로그램 <== ObjectInputStream <== FileInputStream <== 파일(HDD)

public class FileMain07 {

	public static void main(String[] args) {
		InputStream in = null;
		ObjectInputStream oin = null;

		try {
			in = new FileInputStream("temp/member.txt");
			oin = new ObjectInputStream(in);
			
			while(true) {
				try {
					Member m = (Member) oin.readObject();
					m.displayInfo();
				} catch (Exception e) {
					break;
				}
			} // end while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // end main()

} // end FileMain07
