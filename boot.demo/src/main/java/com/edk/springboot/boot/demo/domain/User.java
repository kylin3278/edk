package com.edk.springboot.boot.demo.domain;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String password;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
