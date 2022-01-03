package com.example.mundoDisney.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.mundoDisney.entities.Characters;
import com.example.mundoDisney.entities.Movies;
import com.example.mundoDisney.repository.BaseRepository;
import com.example.mundoDisney.repository.CharacterRepository;

@Service
public class CharacterServiceImpl extends BaseServiceImpl<Characters, Long> implements CharacterService {

	@Autowired
	private CharacterRepository characterRepository;
	
	public CharacterServiceImpl(BaseRepository <Characters, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Characters> search(String filtro) throws Exception {
		try {
			List<Characters> character = characterRepository.findByNombreContaining(filtro);
			return character;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}	
	
	
	@Override
	public Page<Characters> search(String filtro, Pageable pageable) throws Exception {
		try {
			Page<Characters> character = characterRepository.findByNombreContaining(filtro, pageable);
			return character;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

		
	@Override
	public List<Characters> search(int age) throws Exception {
		try {
			List<Characters> character = characterRepository.findByEdadContaining(age);
			return character;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Characters> search(Movies movies) throws Exception {
		try {
			List<Characters> character = characterRepository.findByPeliculaAsociadaContaining(movies);
			return character;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}	
	
}
