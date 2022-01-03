package com.example.mundoDisney.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "Genero")
@NoArgsConstructor
@AllArgsConstructor
public class Genre extends Base{
	
	@Column(name= "Nombre")
	private String nombre;
	
	//private imagen;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "Genero_pelicula",
			joinColumns = @JoinColumn(name = "genero_id"),
			inverseJoinColumns = @JoinColumn(name="pelicula_id")
			)
	private List<Movies> peliculas= new ArrayList<Movies>();
	
	//GETTERS and SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Movies> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Movies> peliculas) {
		this.peliculas = peliculas;
	}

	
	

}
