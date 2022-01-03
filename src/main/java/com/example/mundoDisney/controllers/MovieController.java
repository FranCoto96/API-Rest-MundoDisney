package com.example.mundoDisney.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundoDisney.entities.Movies;
import com.example.mundoDisney.service.MovieServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/movies")
public class MovieController extends BaseControllerImpl<Movies, MovieServiceImpl> {

	@GetMapping("searchTitle/movies")
	public ResponseEntity<?> search(@RequestParam String name){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.search(name));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+ "\"}");
		}
	}
	
}
