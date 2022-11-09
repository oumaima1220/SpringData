package com.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicule implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String codeInterne;
	private String immatriculation;
	public Vehicule() {
	// Constructeur vide utilisé par la librairie Jackson.
	}
	public Long getId() {
	return this.id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public String getCodeInterne() {
	return this.codeInterne;
	}
	public void setCodeInterne(String codeInterne) {
	this.codeInterne = codeInterne;
	}
	public String getImmatriculation() {
	return this.immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
	this.immatriculation = immatriculation;
	}
}

