package edu.java.switch01;

/*
 * switch
 * - if문과 같이 쓰이는 제어문
 * - 변수의 값에 따라 실행문이 선택됨
 * - 선언 형태
 *    switch(변수) {
 *    	case 특정값 : 본문 1; (break;)
 * 		case 특정값 : 본문 2; (break;)
 * 		default : 본문 3; (break;)
 * 	  }
 */		

public class SwitchMain01 {

	public static void main(String[] args) {
		System.out.println("switch문");

		System.out.println(Math.random());
		// Math.random() : 0 이상 1 미만의 값 중 무작위로 double값을 돌려줌
		
		int num = (int)(Math.random()*6+1);	// double -> int 강제 형변환
		// 1~6까지의 난수 생성
		System.out.println(num);
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;	// break : 다음 case문을 실행하지 않고 switch문 종료
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:	// 위의 경우 외에 값이 나오면 실행됨
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		
	}	// end main()

}	// end SwitchMain01
