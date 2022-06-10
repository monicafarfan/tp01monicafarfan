package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto3 {

	private int numero;

	public Punto3() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean esPar() {
		return (numero % 2 == 0);
	}
}