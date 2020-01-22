package edu.java.lambda01;

// FunctionalInterface : 추상 메소드가 하나뿐인 인터페이스
// 람다(lambda) 표현식은 functional interface만 사용 가능
@FunctionalInterface
public interface Adder {
	public abstract double add(double x, double y);
} // end Adder