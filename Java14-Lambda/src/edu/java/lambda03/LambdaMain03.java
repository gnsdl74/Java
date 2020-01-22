package edu.java.lambda03;

@FunctionalInterface
interface Test1 {
	public abstract void printMax(int x, int y);
} // end Test1

@FunctionalInterface
interface Test2 {
	public abstract int findMax(int x, int y);
} // end Test2

public class LambdaMain03 {

	public static void main(String[] args) {
		// 람다 표현식을 이용하여 구현
		Test1 test1 = (x, y) -> {
			int max;
			if (x > y) {
				max = x;
			} else {
				max = y;
			}
			System.out.println("최대값 : " + max);
		};
		test1.printMax(100, 101);

		System.out.println();
		Test2 test2 = (x, y) -> {
			// 삼항 연산자
			return (x > y) ? x : y;
		};
		int result = test2.findMax(5, 10);
		System.out.println("최대값 : " + result);

	} // end main()

} // end LambdaMain03
