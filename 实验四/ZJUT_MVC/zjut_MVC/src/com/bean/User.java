package com.bean;

public class User {
	private String username;
	private String password;
	private String sex;
	private int age;
	private String address;
	public User(String username, String password, String sex, int age, String address) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
