package edu.java.inherit03;

public class InheritMain03 {

	public static void main(String[] args) {

		SmartPhone phone1 = new SmartPhone();
		System.out.println(phone1);
		System.out.println("======================================");
		System.out.println();
		
		SmartPhone phone2 = new SmartPhone("010-1234-5678");
		System.out.println(phone2);
		System.out.println("======================================");
		System.out.println();
		
		SmartPhone phone3 = new SmartPhone("010-3333-7777", "171.12.51.667");
		System.out.println(phone3);
	} // end main()

} // end InheritMain03
