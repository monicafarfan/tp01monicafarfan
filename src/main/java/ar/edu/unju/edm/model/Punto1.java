package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto1 {
	private int numero;

	public Punto1() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int Factorial(int numero) {

		// Factorial con un bucle for

		int facteano = 1;
		for (int i = 1; i <= numero; i++) {
			facteano = i * facteano;
		}
		return facteano;
	}
}