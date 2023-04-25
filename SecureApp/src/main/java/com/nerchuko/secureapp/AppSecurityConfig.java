package com.nerchuko.secureapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class AppSecurityConfig{	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
	}
	
//	@Bean
//	public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
//	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//	    manager.createUser(User.withUsername("user")
//	      .password(bCryptPasswordEncoder.encode("userPass"))
//	      .roles("USER")
//	      .build());
//	    manager.createUser(User.withUsername("admin")
//	      .password(bCryptPasswordEncoder.encode("adminPass"))
//	      .roles("USER", "ADMIN")
//	      .build());
//	    return manager;
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//	    return new BCryptPasswordEncoder();
//	}
//
	

}
