package edu.java.string02;

public class StringMain02 {

	public static void main(String[] args) {
		// String literal과 생성자 호출의 차이
		// - 생성자는 호출할 때마다 새로운 인스턴스가 생성됨(주소값이 다름)
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		// -> 참조 변수(str1, str2)에는 다른 주소값이 저장됨
		if(str1 == str2) {
			// 1번
			System.out.println("같은 참조");
		} else {
			// 2번
			System.out.println("다른 참조");
		}
		
		// 문자열 리터럴을 사용해서 초기화하는 경우
		// 리터럴이 없으면 새로 인스턴스를 생성하지만
		// 이미 리터럴이 만들어져 있는 경우는
		// 인스턴스를 생성하지 않고, 기존의 인스턴스를 재활용
		String str3 = "abc";
		String str4 = "abc";
		// -> 참조 변수(str3, str4)는 같은 주소값을 저장
		if(str3 == str4) {
			// 1번
			System.out.println("같은 참조");
		} else {
			// 2번
			System.out.println("다른 참조");
		}
		
	} // end main()

} // end StringMain02
