package com.hibernate.chapter1;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Habitacio {

	/**
	 * @param args
	 */
	private int numero;

	@Id
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	 

}


