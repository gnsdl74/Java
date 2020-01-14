package edu.java.interface01;

public interface DatabaseQuerry {
	// 인터페이스의 멤벼 변수 : public static final
	public static int DATABASE_VERSION = 1; 
	
	// 인터페이스의 메소드 : public abstract
	public abstract int insert(String id, String pw);
}
