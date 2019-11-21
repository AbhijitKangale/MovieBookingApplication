package com.sapient.auth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sapient.auth.model.AuthUserDetail;
import com.sapient.auth.model.User;
import com.sapient.auth.repository.UserDetailRepository;

@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailRepository userDetailRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		Optional<User> optionalUser = userDetailRepository.findByUsername(name);

		optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or password wrong"));

		UserDetails userDetails = new AuthUserDetail(optionalUser.get());

		new AccountStatusUserDetailsChecker().check(userDetails);

		return userDetails;
	}
}
