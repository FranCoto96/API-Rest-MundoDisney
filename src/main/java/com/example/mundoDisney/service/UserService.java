package com.example.mundoDisney.service;

import com.example.mundoDisney.entities.Users;

public interface UserService {

	public Users findByUsername(String username);
	public Users registrar(Users u);
	
}
