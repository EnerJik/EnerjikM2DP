package com.ujf.m2miage.enerjikdp.model;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3245785083948696325L;

	private Long id;
	
	private String firstName;
	private String lastName;

	private String username;
	private String password;
	

	private Date creationDate;
	
	private Integer role;
	private Role roles;

	public User() {}
	
	public User(String username, String password, String firstName, String lastName, Role role) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = role;
	}
	
	public User(String username, String firstName, String lastName, Role role) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = role;
	}

	public User(String username) {
		this.username = username;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role role) {
		this.roles = role;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
}
