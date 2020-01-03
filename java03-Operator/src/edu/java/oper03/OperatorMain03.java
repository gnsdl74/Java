package edu.java.oper03;

/*
 * 증감 연산자
 * - 변수의 값을 1 증가 또는 감소할 때 사용하는 연산자
 * - 변수의 앞(prefix)과 뒤(postfix)에 사용
 * - ++, --
 */
public class OperatorMain03 {
	
	public static void main(String[] args) {
		System.out.println("증감 연산자(++, --)");
		
		int num = 100;
		num++;
		// num = num + 1;
		// num += 1;
		System.out.println("num = " + num);
		
		int num2 = 100;
		++num2;
		System.out.println("num2 = " + num2);
		
		int num3 = 100;
		int result = ++num3 + 5;
		System.out.println("num3 = " + num3);
		System.out.println("result = " + result);
		
		int num4 = 100;
		result = num4++ + 5;
		System.out.println("num4 = " + num4);
		System.out.println("result = " + result);
		
		/*
		 * 증감연산자는 변수 앞 또는 변수 뒤에 사용할 수 있음
		 * 증감 연산자가 단독으로 사용되는 경우는 앞과 뒤가 모두 동일한 결과
		 *   x++; 와 ++x;는 동일한 효과
		 *   증감 연산자가 다른 연산자와 함께 사용되는 경우는
		 *   앞은 다른 연산자보다 먼저 계산이 되고
		 *   뒤는 다른 연산자보다 나중에 계산이 됨
		 */
		
		int x = 10;
		result = x++ + 5 + ++x;	// 10 + 5 + 12 = 27
		
	}	// end main()
	
}	// end OperatorMain03
