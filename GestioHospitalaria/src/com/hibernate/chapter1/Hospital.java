package com.hibernate.chapter1;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Hospital {


	private String nom;
	private String adreca; 
	private String descripcio;
	
	@Id
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	

}

