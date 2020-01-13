package edu.java.access03;

public class AccessMain03 {

	public static void main(String[] args) {
		// MyNumber 클래스의 인스턴스 생성
		MyNumber num = new MyNumber(100);
		System.out.println("number = " + num.getNumber());
		num.add(1);
//		System.out.println(num.number);
		System.out.println("number = " + num.getNumber());
		
		// num.number 변수의 값을 10으로 변경 및 출력
		num.setNumber(10);
		System.out.println("number = " + num.getNumber());
		
	} // end main()

} // end AccessMain03
