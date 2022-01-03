package com.example.mundoDisney.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.mundoDisney.entities.Users;
import com.example.mundoDisney.repository.BaseRepository;
import com.example.mundoDisney.repository.UserRepository;

@Service
public class UserServiceImpl extends BaseServiceImpl<Users, Long> implements UserService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(BaseRepository<Users, Long> baseRepository) {
		super(baseRepository);		
	}

	@Override
	public Users findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public Users registrar(Users u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return userRepository.save(u);
	}

}
