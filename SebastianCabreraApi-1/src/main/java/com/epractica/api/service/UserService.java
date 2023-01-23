package com.epractica.api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.epractica.api.entity.User;
import java.util.*;
public interface UserService {

	public Iterable<User> findAll();
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);
}
