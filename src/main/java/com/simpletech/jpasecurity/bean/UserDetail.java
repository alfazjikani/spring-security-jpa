package com.simpletech.jpasecurity.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class UserDetail {
	
	@Id
	private int id;
	
	private String username;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable
	(
		name = "user_role", 
		joinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) }, 
		inverseJoinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }
	)
	private Set<Role> roleList = new HashSet<Role>(0);

	public UserDetail() {
		super();
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

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", username=" + username + ", password=" + password + ", roleList=" + roleList
				+ "]";
	}
	
}
