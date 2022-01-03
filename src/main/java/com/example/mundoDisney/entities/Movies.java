package com.example.mundoDisney.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Pelicula")
@NoArgsConstructor
@AllArgsConstructor
public class Movies extends Base {
	
	

	//private imagen;
	
	@Column(name= "Titulo")
	private String titulo;
	
	@Column(name= "FechaDeCreacion")
	private Date fechaCreacion;

	@Column(name= "Calificacion")
	private int calificacion;

	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Characters> personajeAsociado;
	
	
	//GETTERS and SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Characters> getPersonajeAsociado() {
		return personajeAsociado;
	}

	public void setPersonajeAsociado(List<Characters> personajeAsociado) {
		this.personajeAsociado = personajeAsociado;
	}
	

	


}
