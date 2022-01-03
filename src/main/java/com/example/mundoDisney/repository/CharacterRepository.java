package com.example.mundoDisney.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.example.mundoDisney.entities.Characters;
import com.example.mundoDisney.entities.Movies;

@Repository
public interface CharacterRepository extends BaseRepository<Characters, Long> {
	
	List<Characters> findByNombreContaining (String nombre);
	
	Page<Characters> findByNombreContaining (String nombre, Pageable pageable);
	
	List<Characters> findByEdadContaining (int edad);
	
	List<Characters> findByPeliculaAsociadaContaining(Movies peliculaAsociada );
	
}
