package com.simpletech.jpasecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.simpletech.jpasecurity.bean.UserDetail;

import java.lang.String;

public interface UserRepository extends CrudRepository<UserDetail, Integer> {

	UserDetail findByUsername(String username);
	
}
