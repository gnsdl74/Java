package edu.java.file09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import edu.java.file06.Member;

public class FileMain09 {

	public static void main(String[] args) {
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/big_member.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			// 파일에서 정보를 읽어올때는 하나씩 꺼내오는 것이 효용성이 좋음
			List<Member> list = new ArrayList<Member>();
			long startTime = System.currentTimeMillis();
			while(true) {
				try {
					Member m = (Member) oin.readObject();
					list.add(m);
				} catch (EOFException e) { // 파일이 끝이 났을 때 break
					break;
				}
			}
			long endTime = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (endTime-startTime));
			System.out.println("리스트 크기 : " + list.size());
			
			for(Member m : list) {
				m.displayInfo();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				oin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end entire try-catch-finally
		
	} // end main()

} // end FileMain09
