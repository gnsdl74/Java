package edu.java.access11;

/*
     싱글톤 디자인 패턴(singleton design pattern)
   - 클래스와 인스턴스를 오직 하나만 생성할 수 있도록 작성하는 설계 기법
   1. 클래스 자신 타입의 private static 변수를 선언
   2. 생성자는 private으로 선언
   3. public static 메소드를 제공하여 인스턴스를 생성할 수 있도록 함

   - 싱글톤 사용 이유
   1. 고정된 메모리 영역을 얻어서 인스턴스를 한번 생성하기 때문에 메모리 낭비 방지
   2. 싱글톤 클래스의 인스턴스는 전역 인스턴스이므로 데이터 공유가 쉬움
   3. 쓰레드풀, 캐시, 네트워크 연결, DB 연결 등 공통 객체를 사용해야 하는 상황에서 사용
 */
public class Captain {
	// 멤버 변수
	private String name;
	
	// 1. private static Captain 변수를 선언
	private static Captain instance = null;
	// 2. private 생성자
	private Captain() {}
	// 3. public static 메소드를 정의하여 인스턴스 생성
	public static Captain getInstance() {
		if(instance == null) {
			instance = new Captain();
		}
		return instance;
	}	// end getInstance()
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}	// end Captain
