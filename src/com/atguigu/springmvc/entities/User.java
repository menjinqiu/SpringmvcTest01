package com.atguigu.springmvc.entities;

public class User {

	private Integer id;
	private String userName;
	private String passWorld;
	private int age;
	private String email;
	
	
	public User() {
		super();
	}


	public User(Integer id, String userName, String passWorld, int age,
			String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWorld = passWorld;
		this.age = age;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWorld() {
		return passWorld;
	}


	public void setPassWorld(String passWorld) {
		this.passWorld = passWorld;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
