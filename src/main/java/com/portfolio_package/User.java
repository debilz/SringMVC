package com.portfolio_package;

public class User {
	private String userName, password;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public String getPassword() {
		return this.password;
	}
	
	public String showUserInfo() {
		return "Welcome User: " + this.userName + "\nYour password is: " + this.password;
	}
}
