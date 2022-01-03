package com.example.mundoDisney.repository;

import org.springframework.stereotype.Repository;

import com.example.mundoDisney.entities.Users;

@Repository
public interface UserRepository extends BaseRepository<Users, Long> {

	public Users findByUsername(String username);
	
}
