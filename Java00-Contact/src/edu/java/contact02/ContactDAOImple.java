package edu.java.contact02;

public class ContactDAOImple implements ContactDAO {
	private static String className = ContactDAOImple.class.getName();
	// 데이터를 넘길 때 어느 위치로 데이터를 넘겼는지 log로 확인하기 위한 용도 (클래스의 위치 및 이름 저장)
	
	// start singleton
	private static ContactDAOImple instance;

	private ContactDAOImple() {}
	
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	// end singleton
	
	private static int MAX = 100;
	private ContactVO[] list = new ContactVO[MAX];
	private int count;
	
	public int getCount() {
		return count;
	} // end getCount()
	
	@Override
	public int insert(ContactVO vo) {
		System.out.println(className + " - insert()");
		list[count] = vo;
		count++;
		return 1;
	} // end insert()

	@Override
	public ContactVO[] select() {
		return list;
	} // end select()

	@Override
	public ContactVO select(int index) {
		if(index >= 0 && index < count) {
			return list[index];
		}
			return null;
	} // end select()

	@Override
	public int update(int index, ContactVO vo) {
		list[index].setName(vo.getName());
		list[index].setPhone(vo.getPhone());
		list[index].setEmail(vo.getEmail());
		return 1;
	} // end update()

} // end ContactDAOImple
