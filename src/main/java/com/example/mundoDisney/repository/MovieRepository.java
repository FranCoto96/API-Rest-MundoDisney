package com.example.mundoDisney.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.mundoDisney.entities.Movies;

@Repository
public interface MovieRepository extends BaseRepository<Movies, Long> {
	
	List<Movies> findByTituloContaining (String titulo);
	
	
}
