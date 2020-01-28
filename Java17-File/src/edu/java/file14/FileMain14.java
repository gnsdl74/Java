package edu.java.file14;

import java.io.File;

public class FileMain14 {

	public static void main(String[] args) {
		// 현재 디렉토리(current working directory) 정보 확인
		String cwd = System.getProperty("user.dir");
		System.out.println("CWD : " + cwd);
		
		// 현재 디렉토리에 대한 File 객체
		File f = new File(cwd);
		// getName() : 파일, 디렉토리의 이름을 리턴
		System.out.println("이름 : " + f.getName());
		// getPath() : 경로를 리턴
		//    File 객체를 생성할 때
		//    1) 절대 경로로 생성했으면, 절대 경로로 이름을 리턴
		//    2) 상대 경로로 생성했으면, 상대 경로로 이름을 리턴
		System.out.println("경로 : " + f.getPath());
		// getAbsolutePath() : 절대 경로를 리턴
		System.out.println("절대 경로 : " + f.getAbsolutePath());
		// isDirectory() : File 객체가 디렉토리이면 true를 리턴 
		// isFile() : File 객체가 파일이면 true를 리턴
		System.out.println("디렉토리? " + f.isDirectory());
		System.out.println("파일? " + f.isFile());
		
		System.out.println();
		// listFiles() : 폴더(디렉토리)의 내용 확인
		File[] list = f.listFiles();
		for(File file : list) {
			if(file.isDirectory()) { // 디렉토리?
				System.out.print("<DIR>\t"); // \t : 탭
			} else { // 파일?
				System.out.print("<FILE>\t");
			}
			System.out.print(file.getName() + "\t");
			System.out.println(file.length() + "Bytes");
		}
		
		
	} // end main()

} // end FileMain14
