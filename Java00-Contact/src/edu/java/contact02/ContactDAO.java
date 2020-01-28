package edu.java.contact02;

public interface ContactDAO {
	public abstract int insert(ContactVO vo);
	public abstract ContactVO[] select();
	public abstract ContactVO select(int index);
	public abstract int update(int index, ContactVO vo);
	
} // end ContactDAO
