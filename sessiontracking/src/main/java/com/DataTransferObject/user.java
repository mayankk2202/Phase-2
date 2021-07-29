package com.DataTransferObject;

public class user {
	private String fname;
	private String lname;
	private String city;
	private String email;
	private int age=0;
	private long contact=0;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "user [First Name=" + fname + ", Last Name=" + lname + ", City=" + city + ", E-mail=" + email + ", Age=" + age
				+ ", Contact Number=" + contact + "]";
	}
}
