package edu.java.string03;

class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	} // end constructor

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	} // end toString()
	
	@Override
	public boolean equals(Object obj) { // Object : 모든 클래스의 super 클래스
		boolean result = false; // 리턴할 때 사용할 변수
		
		if (obj instanceof Point) { // obj를 Point 클래스의 인스턴스로 변환 가능하면
			Point pt = (Point) obj; // 강제 형변환
			if(x == pt.x && y == pt.y) { // 두 개의 좌표를 비교해서 같으면
				result = true;
			}
		}
		return result;
	}
	
} // end Point

public class EqualsTest {

	public static void main(String[] args) {
		Point pt1 = new Point(1, 2);
		System.out.println(pt1);
		
		Point pt2 = new Point(1, 2);
		System.out.println(pt2);
		
		// 비교 연산자(==) : 참조 변수의 주소값만 비교
		if (pt1 == pt2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		// equals() 메소드 : 객체의 값 비교
		if (pt1.equals(pt2)) {
			System.out.println("같은 좌표");
		} else {
			System.out.println("다른 좌표");
		}
		// 같은 좌표로 출력하려면 equals를 오버라이딩해야함
		
	} // end main()

} // end StringMain03
