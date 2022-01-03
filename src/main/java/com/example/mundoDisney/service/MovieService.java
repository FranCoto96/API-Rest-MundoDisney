package com.example.mundoDisney.service;

import java.util.List;

import com.example.mundoDisney.entities.Movies;

public interface MovieService extends BaseService<Movies, Long> {
	
	List<Movies> search(String name) throws Exception;

}
