package com.epractica.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epractica.api.entity.User;
import com.epractica.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    @Transactional(readOnly = true)
	    public Iterable<User> findAll() {
	        return userRepository.findAll();
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public Page<User> findAll(Pageable pageable) {
	        return userRepository.findAll(pageable);
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public Optional<User> findById(Long id) {
	        return userRepository.findById(id);
	    }

	    @Override
	    @Transactional
	    public User save(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    @Transactional
	    public void deleteById(Long id) {
	        userRepository.deleteById(id);
	    }

}
