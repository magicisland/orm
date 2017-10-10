package org.javabrains.koushik.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {

	protected int userId;
	protected String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + "]";
	}
	
	public UserDetails(){
		
	}
}
