package edu.java.access07;

import edu.java.access06.TestPublic;

public class AccessMain07 {

	public static void main(String[] args) {
		// edu.java.access06.TestPublic의 인스턴스 생성 가능
		// public class 중 main이 없는 public class의 인스턴스 생성 가능
		TestPublic test1 = new TestPublic();
		System.out.println(test1);
		
//		TestPackage test2 = new TestPackage();
		// edu.java.access06.TestPackage는
		// (package) 클래스이므로 다른 패키지에 속한 클래스에서는 인스턴스 생성이 불가능
		
	}	// end main()

}	// end AccessMain07
