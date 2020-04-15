package com.Spring;

public class users {
	private long id;
	 private String firstName;
	 private String lastName;
	 private String userName;
	 private String password;
	 private String mailId;
	 private int phoneNo;
	  
	public users() {}
	
	public users(long id, String firstName, String lastName, String userName, String password, String mailId, int phoneNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}
	
	public users(long id, String userName, String firstName, String password) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", mailId=" + mailId + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
