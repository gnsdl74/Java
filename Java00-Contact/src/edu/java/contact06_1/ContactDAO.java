package edu.java.contact06_1;

import java.util.ArrayList;

public interface ContactDAO {
	public abstract int insert(ContactVO vo);
	public abstract ArrayList<ContactVO> select();
	public abstract ArrayList<ContactVO> selectName(String S_name);
	public abstract int update(int index, ContactVO vo);
	public abstract int delete(int index);
	
} // end ContactDAO
