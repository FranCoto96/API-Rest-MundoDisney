package com.example.mundoDisney.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.mundoDisney.entities.Characters;
import com.example.mundoDisney.entities.Movies;

public interface CharacterService extends BaseService<Characters, Long>{

	List<Characters> search(String name) throws Exception;
	
	Page<Characters> search(String name, Pageable pageable) throws Exception;
	
	List<Characters> search (int age) throws Exception;
	
	List<Characters> search(Movies movies ) throws Exception;
}
