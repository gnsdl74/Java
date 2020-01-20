package edu.java.wrapper04;

import java.math.BigInteger;

/*
 * BigInteger : 저장할 수 있는 정수값의 한계가 없는 크래스
 * BigDecimal : 실수 계산의 오차를 줄이거나 없애기 위해서 만들어진 클래스
 * auto boxing과 auto unboxing 기능을 제공하지 않음
 * -> 생성자를 호출하여 인스턴스를 생성해야 함
 * -> 산술연산(+, -, *, /)은 메소드를 사용해야 함
 */
public class WrapperMain04 {

	public static void main(String[] args) {
		
//		long n = 12345678912345678912L;
		// long 타입도 저장할 수 있는 한계가 존재
		
		// BigInteger 생성자의 매개변수는 문자열
		// 이유 : 아주 큰 숫자 리터럴을 저장할 수 있는 기본타입이 없기 때문에
		BigInteger big = new BigInteger("1234567891234567891234");
		System.out.println(big);

		// BigInteger의 사칙연산 :
		// add(), subtract(), multiply(), divide(), mod() 메소드 사용
		BigInteger a = new BigInteger("10");
		BigInteger b = new BigInteger("20");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		System.out.println(a.mod(b));
		
	} // end main()

} // end WrapperMain04
