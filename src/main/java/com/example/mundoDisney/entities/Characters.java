package com.example.mundoDisney.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Personaje")
@NoArgsConstructor
@AllArgsConstructor
public class Characters extends Base{

	//private imagen;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Edad")
	private int edad;
	
	@Column(name="Peso")
	private Float peso;
	
	@Column(name="Historia")
	private String historia;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Movies> peliculaAsociada;
	
	
	//GETTERS and SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public List<Movies> getPeliculaAsociada() {
		return peliculaAsociada;
	}

	public void setPeliculaAsociada(List<Movies> peliculaAsociada) {
		this.peliculaAsociada = peliculaAsociada;
	}

	
	
	
}
