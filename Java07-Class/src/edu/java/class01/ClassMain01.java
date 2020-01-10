package edu.java.class01;

public class ClassMain01 {

	// 프로그램의 시작점 : main() 메소드
	public static void main(String[] args) {

		// 클래스의 "객체(인스턴스)"를 "생성"한다.
		// 클래스이름 변수이름 = new 생성자();

		// 변수 타입
		// - 기본타입변수 : byte, char, int 등. 실제 값을 변수 안에 저장
		// 예) int a = 3, b = 10;
		// - 참조타입변수 : 배열, 크래스, 인터페이스 등. 주소를 통해 객체 참조(reference)
		// 예) int[] a = new int[3]; BasicTv tv = new BasicTv();
		// ※ BasicTv 클래스를 tv1, tv2의 변수명으로 객체 생성할 경우 : 변수명은 다르지만 BasicTv 클래스를 참조하기 떄문에 주소값은 같음.

		BasicTv tv = new BasicTv();
		tv.displayInfo();
		// * 기본 생성자를 호출하여 객체를 생성하게 되면
		//   클래스의 멤버 변수들은 기본값으로 초기화됨
		//   숫자(int, double, ...) 타입의 기본값 : 0
		//   boolean 타입의 기본값 : false
		//   그 외 타입(참조 타입) : null
//		BasicTv tv2 = null;
//		tv2.displayInfo();
		// NullPointerException : 참조변수가 null 값을 가진 경우, 객체의 멤버 변수나 메소드를 사용하면 발생하는 프로그램 오류
		
		// TV의 기능(메소드) 사용
		// => BasicTv 클래스가 가지고 있는 메소드 호출
		// 참조변수이름.메소드(매개변수);
		tv.turnOnOff();	// 전원 on
		tv.displayInfo();
		
		tv.turnOnOff();	// 전원 off
		tv.channelUp();
		tv.displayInfo();
		
	} // end main()

} // end ClassMain
