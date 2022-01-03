package com.example.mundoDisney.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Users extends Base {
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String username;
	
	private String password;

	public String getNombre() {
		return nombre;
	}

	
	//GETTERS and SETTERS
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
