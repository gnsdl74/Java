package edu.java.file05;

import java.io.*;

/*
 * 프로그램 <== FileInputStream <== 파일(HDD)
 * FlieInputStream의 read() 메소드는 HDD를 직접 접근 -> 속도 느림
 * 프로그램 <== BufferedInputStream <== FileInputStream <== 파일(HDD)
 * BufferedInputStream의 read() 메소드는 메모리 버퍼에서 읽음 -> 속도 빠름

 * 프로그램 ==> FileOutputStream ==> 파일(HDD)
 * FlieOutputStream의 write() 메소드는 HDD를 직접 접근 -> 속도 느림
 * 프로그램 ==> BufferedOutputStream ==> FileOutputStream ==> 파일(HDD)
 * BufferedOutputStream의 write() 메소드는 메모리 버퍼에서 읽음 -> 속도 빠름
 */
public class FileMain05 {

	public static void main(String[] args) {
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;
		BufferedOutputStream bout = null;

		try {
			in = new FileInputStream("temp/big_text.txt");
			// 메모리 버퍼를 접근하는 BufferedInputStream 객체 생성
			bin = new BufferedInputStream(in);

			out = new FileOutputStream("temp/big3.txt");
			// 메모리 버퍼를 접근하는 BufferedOutputStream 객체 생성
			bout = new BufferedOutputStream(out);

			int data = 0; // read() 메소드가 리턴하는 값을 저장할 변수
			int byteCopied = 0; // write() 메소드를 호출할 때마다 1씩 증가

			long startTime = System.currentTimeMillis();
			while (true) {
				// read() : 파일에서 1바이트씩 데이터를 읽어 옴
				// 파일 끝에 도달했을 때 -1을 리턴
//				data = bin.read();
				byte[] b = new byte[1024 * 1024];
				data = bin.read(b);
				System.out.println("data = " + data);
				if (data == -1) {
					break; //
				}

				// write() : 1바이트씩 파일에 씀
//				bout.write(data);
				bout.write(b, 0, data);
				byteCopied += data;
			}
			long endTime = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (endTime - startTime));
			System.out.println(byteCopied + "바이트 복사됨");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				bin.close();
				bout.flush();
				bout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // end finally

	} // end main()

} // end FileMain05
