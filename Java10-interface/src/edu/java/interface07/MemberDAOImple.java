package edu.java.interface07;

// DAO(Data Access Object) : MVC 패턴에서 Control 클래스
public class MemberDAOImple implements MemberDAO {

	// -------------------------------------- //
	// Singleton 디자인 패턴 적용 시작

	// 1. private static 자기 자신 타입 멤버 변수 선언
	private static MemberDAOImple instance = null;

	// 2. private 생성자
	private MemberDAOImple() {}

	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드 구현
	public static MemberDAOImple getInstance() {
		if (instance == null) {
			instance = new MemberDAOImple();
		}
		return instance;
	}
	// Singleton 디자인 패턴 적용 끝
	// -------------------------------------- //

	public static final int MAX = 100; // 최대 회원수
	private MemberVO[] list = new MemberVO[MAX]; // 회원 정보를 저장할 배열
	private int count; // 배열에 저장된 데이터 개수

	public int getCount() {
		return count;
	}

	@Override
	public int insert(MemberVO vo) {
		// UI 클래스가 전달해준 회원 정보를 배열에 저장
		list[count] = vo;
		count++;
		return 1; // 0 : 실패, 1 : 성공
	} // end insertMember()

	@Override
	public MemberVO[] select() {
		return list;
	} // end selectAll()

	@Override
	public MemberVO select(int index) {
		if (index >= 0 && index < count) { // 전체 연락처 사이즈로 제한
			return list[index];
		} else {
			return null;
		}

	} // end selectByIndex()

	@Override
	public int update(int index, MemberVO vo) {
		if(index >= 0 && index < count) {
			list[index].setPw(vo.getPw());
			list[index].setEmail(vo.getEmail());
			return 1; // 성공
		} else {
			return 0; // 실패
		}
		
	} // end updateMember()

} // end MemberDAOImple
