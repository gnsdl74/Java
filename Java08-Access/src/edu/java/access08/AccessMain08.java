package edu.java.access08;

public class AccessMain08 {

	public static void main(String[] args) {
		MyNumber num1 = new MyNumber();
		System.out.println(num1);
		System.out.println(num1.getData());
		
		MyNumber num2 = new MyNumber(10);
		System.out.println(num2.getData());
		
		// num1의 메소드 add() 호출
		MyNumber result = num1.add(num2);
		System.out.println(result.getData());
		
		System.out.println("====================");
		MyNumber x = new MyNumber(1);
		MyNumber y = new MyNumber(2);
		MyNumber z = new MyNumber(3);
		MyNumber end = new MyNumber(4);
		
		x.add(y).add(z).add(end);
		System.out.println(x.getData());
		
		
	}	// end main()

}	// end AccessMain08
