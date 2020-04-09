package com.spring.SpringRest.Advertise;

public class User {
	 private String firstName;
	 private String lastName;
	 private String UserName;
	 private String passWord;
	 private String mailId;
	 private int phoneNo;
	public User(String firstName, String lastName, String userName, String passWord, String mailId, int phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		UserName = userName;
		this.passWord = passWord;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", UserName=" + UserName + ", passWord="
				+ passWord + ", mailId=" + mailId + ", phoneNo=" + phoneNo + "]";
	}
	 
}
