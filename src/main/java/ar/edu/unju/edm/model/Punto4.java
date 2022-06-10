package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto4 {

	private int numero;

	public Punto4() {
		// TODO Auto-generated constructor stub

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean mes() {
		if (numero > 0 && numero < 13)
			return true;
		else
			return false;
	}

}