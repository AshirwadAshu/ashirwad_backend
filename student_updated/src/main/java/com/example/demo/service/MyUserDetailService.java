package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentInfo;
import com.example.demo.entity.UserPrinciple;
import com.example.demo.repository.StudentRepository;
@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<StudentInfo> studentOptional = repository.findByEmail(email);
	    
	    if (!studentOptional.isPresent()) {
	        System.out.println("User Not Found");
	        throw new UsernameNotFoundException("User not found");
	    }

	    StudentInfo student = studentOptional.get();
	    
	    // Map StudentInfo to UserDetails
	    return new UserPrinciple(student);
	}

}
