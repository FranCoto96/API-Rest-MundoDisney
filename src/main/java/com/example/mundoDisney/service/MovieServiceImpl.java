package com.example.mundoDisney.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mundoDisney.entities.Movies;
import com.example.mundoDisney.repository.BaseRepository;
import com.example.mundoDisney.repository.MovieRepository;

@Service
public class MovieServiceImpl extends BaseServiceImpl<Movies, Long> implements MovieService{

	@Autowired
	private MovieRepository movieRepository; 	
	
	public MovieServiceImpl(BaseRepository<Movies, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Movies> search(String name) throws Exception {
		try {
			List<Movies> movie = movieRepository.findByTituloContaining(name);
			return movie;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}		
	}
	
	
}
