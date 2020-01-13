package edu.java.access11;

public class AccessMain11 {

	public static void main(String[] args) {
		// Captain 클래스의 인스턴스(객체) 생성
//		Captain c1 = new Captain();	// Captain 클래스 내에서 private으로 생성자를 막음.
		Captain c1 = Captain.getInstance();
		c1.setName("Black");
		System.out.println(c1);
		System.out.println(c1.getName());
		
		System.out.println();
		Captain c2 = Captain.getInstance();
		System.out.println(c2);
		System.out.println(c2.getName());
		System.out.println();
		// * 주소값이 같으면 같은 객체(인스턴스)를 공유하는 것
		//   주소값이 다르면 다른 객체(인스턴스)를 사용하는 것
		// 같은 객체를 공유하는 것은 데이터의 변경도 공유하는 것임.
		
		Test t1 = new Test();
		t1.setName("Red");
		System.out.println(t1);
		System.out.println(t1.getName());
		
		Test t2 = new Test();
		System.out.println(t2);
		System.out.println(t2.getName());
	}	// end main()

}	// end AccessMain11
