package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {

	private int ocup;

	public Punto10() {
	}

	public int[] contarAtrasWhile() {
		ocup = 0;
		int seq[] = new int[9];
		int j = 320;
		while (j >= 160) {
			seq[ocup] = j;
			j = j - 20;
			ocup++;
		}
		return seq;
	}

	public void mostrarSecuencia(int array[]) {
		int i;
		for (i = 0; i < ocup; i++)
			System.out.print(array[i] + " ");

	}
}