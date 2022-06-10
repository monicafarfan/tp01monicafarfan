package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {
	private int ocup;

	public Punto11() {
	}

	public int[] contarAtrasDoWhile() {
		ocup = 0;
		int seq[] = new int[9];
		int j = 320;
		do {
			seq[ocup] = j;
			j = j - 20;
			ocup++;
		} while (j >= 160);

		return seq;
	}

	public void mostrarSecuencia(int array[]) {
		int i;
		for (i = 0; i < ocup; i++)
			System.out.print(array[i] + " ");

	}
}