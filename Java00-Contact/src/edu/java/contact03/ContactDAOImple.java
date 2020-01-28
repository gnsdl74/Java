package edu.java.contact03;

import java.util.*;

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
	
	private ArrayList<ContactVO> list = new ArrayList<>();
	
	public ArrayList<ContactVO> getList() {
		return list;
	}
	
	@Override
	public int insert(ContactVO vo) {
		System.out.println(className + " - insert()");
		boolean check = list.add(vo);
		if(check == true) {
			return 1;
		} else {
			return 0;
		}
		
	} // end insert()

	@Override
	public ArrayList<ContactVO> select() {
		return (ArrayList<ContactVO>) list;
	} // end selectAll()

	@Override
	public ContactVO select(int index) {
		if(index >= 0 && index < list.size()) {
			return list.get(index);
		}
			return null;
	} // end select_By_Index()

	@Override
	public int update(int index, ContactVO vo) {
		if (index >= 0 && index < list.size()) {
			list.set(index, vo);
			return 1;
		} else {
			return 0;
		}
	} // end update()

	@Override
	public int delete(int index) {
		if (index >= 0 && index < list.size()) {
			list.remove(index);
			return 1;
		} else {
			return 0;
		}
	} // end delete()

} // end ContactDAOImple
