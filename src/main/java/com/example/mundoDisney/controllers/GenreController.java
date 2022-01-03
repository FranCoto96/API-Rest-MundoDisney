package com.example.mundoDisney.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mundoDisney.entities.Genre;
import com.example.mundoDisney.service.GenreServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/genre")
public class GenreController extends BaseControllerImpl<Genre, GenreServiceImpl>{

}
