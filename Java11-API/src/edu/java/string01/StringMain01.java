package edu.java.string01;

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		System.out.println(str1);
		System.out.println("문자열의 길이 : " + str1.length());
		
		System.out.println();
		String str2 = new String("안녕하세요");
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		// String 저장하는 참조 변수에는 문자열이 있는 주소값이 저장됨
		// 비교연산자(==, !=)는 단순 주소값만 비교
		// -> 실제 문자열의 내용이 같더라도 '주소값이 다르다'라는 결과를 줄 수 있음
		// 문자열의 내용이 같은지 다른지 비교할 때는 equals() 메소드를 사용하면 됨
		
		if(str1.equals(str2)) {
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}
		
	} // end main()

} // end StringMain01
