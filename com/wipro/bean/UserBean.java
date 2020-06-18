package com.wipro.bean;

public class UserBean {
	private String username;
	private String password;
	
	public UserBean() {}
	
	public String getUserName() {
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setUserName(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
}

