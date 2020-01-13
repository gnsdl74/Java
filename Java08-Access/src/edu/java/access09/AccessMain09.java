package edu.java.access09;

/*
 * final 수식어
 * - final : 최종적인, 변경할 수 없는
 * - 초기화된 값을 바꿀 수 없음.
 * - final + 멤버 변수, 지역 변수 => 상수(한번 초기화된 값을 변경할 수 없는 변수)
 * - final + 메소드 : override 할 수 없는 메소드
 * - final + 클래스 : 상속을 허용하지 않는 클래스
 */
public class AccessMain09 {
	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;
	public static int test = 100;
	
	public static void main(String[] args) {
		int x = 10;
		final int y = 10;	// final : 더 이상 바꿀 수 없는
		System.out.println(x);
		System.out.println(y);
		
		x = 123;
//		y = 100;
		// 일반적인 지역 변수는 초기화 이후에도 언제든지 값을 변경 가능
		// final 변수는 처음 초기화된 값을 변경할 수 없음
		
		test = 200;
		// final이 아닌 멤버 변수는 언제든지 초기값 변경 가능
		
		System.out.println(Math.PI);
		
	}	// end main()

}	// end AccessMain09
