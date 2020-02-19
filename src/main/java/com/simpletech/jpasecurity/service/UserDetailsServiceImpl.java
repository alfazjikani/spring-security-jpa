package com.simpletech.jpasecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simpletech.jpasecurity.bean.Role;
import com.simpletech.jpasecurity.bean.UserDetail;
import com.simpletech.jpasecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetail userDetail = userRepo.findByUsername(username);
		if(userDetail == null) {
			throw new UsernameNotFoundException("user " + username + " doesn't exist.");
		}

		List<GrantedAuthority> roleList = new ArrayList<GrantedAuthority>();
		for(Role role: userDetail.getRoleList()) {
			roleList.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		return new User(username, userDetail.getPassword(), roleList);
	}

}
