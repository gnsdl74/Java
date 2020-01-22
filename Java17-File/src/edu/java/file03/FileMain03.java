package edu.java.file03;

import java.io.*;

/*
1. 일반적인 try-catch-finally 구문
try {
   (실행문들);
} catch (Exception e) {
   (예외처리);
} finally {
   (항상 실행할 코드들); // 리소스 해제
}

2. try-with-resource 구문 : Java 7버전부터 제공
- try() 안에서 생성된 리소스들의 해제 코드(close();)를 자동으로 호출해줌
try(리소스 생성;) {
   (실행문들);
} catch (Exception e) {
   (예외처리);
} 
 */
public class FileMain03 {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("temp/original.txt");
				OutputStream out = new FileOutputStream("temp/copy2.txt");) {

			int data = 0; // read() 메소드가 리턴하는 값을 저장할 변수
			int byteCopied = 0; // write() 메소드를 호출할 때마다 1씩 증가
			while (true) {
				// read() : 파일에서 1바이트씩 데이터를 읽어 옴
				// 파일 끝에 도달했을 때 -1을 리턴
				data = in.read();
				if (data == -1) {
					break; //
				}

				// write() : 1바이트씩 파일에 씀
				out.write(data);
				byteCopied++;
			}

			// 파일 복사 끝
			System.out.println(byteCopied + "바이트 복사됨");

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end main()

} // end FileMain03
