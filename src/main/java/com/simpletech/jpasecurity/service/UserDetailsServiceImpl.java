package com.simpletech.jpasecurity.service;

import java.util.Arrays;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username, "$2a$10$oMxGv1W6RdeCbF.Hbm8GN.KWfD82M.dkBwapcg7wD/iNJuPTLaTVy", Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
	}

}
