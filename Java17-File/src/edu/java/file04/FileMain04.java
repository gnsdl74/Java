package edu.java.file04;

import java.io.*;

public class FileMain04 {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("temp/big_text.txt");
			 OutputStream out = new FileOutputStream("temp/big2.txt");) {
			int byteCopied = 0; // 복사된 데이터 크기를 저장할 변수
			long startTime = System.currentTimeMillis();
			// 시스템의 현재 시간을 milli-second 단위로 리턴
			
			while(true) {
				// 1KB = 1,024 Bytes
				// 4KB = 4 * 1,024 Bytes
				// 1MB = 1024 * 1024 Bytes
				byte[] buffer = new byte[1024*1024]; // 1MB 공간
				int result = in.read(buffer);
				// read(byte[] b) :
				// 파일에서 읽은 데이터를 매개변수 배열 b에 저장
				// 실제로 읽은 바이트 수를 리턴, 파일 끝에서는 -1을 리턴
				System.out.println("result = " + result);
				if(result == -1 ) { // 파일 끝에 도달
					break;
				}
				out.write(buffer, 0, result);
//				out.write(buffer);
				// write(byte[] b) :
				// 매개변수 배열 b의 내용을 한 번에 파일에 씀
				// write(byte[] b, int off, int len) :
				// 배열 b의 인덱스 off번째부터 len 길이만큼까지만 파일에 씀
				byteCopied += result;
			} // end while
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 경과 시간 : " + (endTime-startTime));
			System.out.println("복사된 바이트 : " + byteCopied);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end main()

} // end FileMain04
