package com.example.mundoDisney.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundoDisney.entities.Characters;
import com.example.mundoDisney.entities.Movies;
import com.example.mundoDisney.service.CharacterServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="api/characters")
public class CharacterController extends BaseControllerImpl<Characters, CharacterServiceImpl>{
	
	@GetMapping("searchName/characters")
	public ResponseEntity<?> search(@RequestParam String name){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.search(name));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+ "\"}");
		}
	}
	
	
	@GetMapping("searchPaged/characters")
	public ResponseEntity<?> search(@RequestParam String name, Pageable pageable){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.search(name, pageable));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+ "\"}");
		}
	}
		
	
	
	@GetMapping("searchAge/characters")
	public ResponseEntity<?> search(@RequestParam int age){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.search(age));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+ "\"}");
		}
	}
	
	@GetMapping("searchMovies/characters")
	public ResponseEntity<?> search(@RequestParam Movies movies){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.search(movies));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+ "\"}");
		}
	}
	
	
}
