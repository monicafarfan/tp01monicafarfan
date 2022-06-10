package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto5 {

	private int numero;

	public Punto5() {
		}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Usando la estructura switch
	public String cualMes(int numeroMes) {
		String mes;
		numeroMes = numero;
		switch (numeroMes) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
			mes = "No existe ese mes";
			break;
		}

		return mes;

	}

}