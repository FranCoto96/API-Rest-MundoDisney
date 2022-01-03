package com.example.mundoDisney.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mundoDisney.entities.Genre;
import com.example.mundoDisney.repository.BaseRepository;
import com.example.mundoDisney.repository.GenreRepository;

@Service
public class GenreServiceImpl extends BaseServiceImpl<Genre, Long> implements GenreService {
	
	@Autowired
	private GenreRepository genreRepository;
	
	public GenreServiceImpl(BaseRepository<Genre, Long> baseRepository) {
		super(baseRepository);
	}

}
