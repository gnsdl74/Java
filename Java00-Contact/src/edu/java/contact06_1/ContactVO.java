package edu.java.contact06_1;

public class ContactVO {
	// variable
	private int cid;
	private String name;
	private String phone;
	private String email;
	
	// constructor
	public ContactVO() {}
	public ContactVO(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	// getter, setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
} // end ContactVO