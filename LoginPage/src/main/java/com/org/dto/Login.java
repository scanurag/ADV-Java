package com.org.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
private String username;
private String password;
}
