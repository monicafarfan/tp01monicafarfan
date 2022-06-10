package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto2 {

	private int year;

	public Punto2() {
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public boolean numBisiesto() {

		boolean bisiesto;
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			bisiesto = true;
		else
			bisiesto = false;

		return bisiesto;
	}
}
//Un año es bisiesto si es multiplo de 4, los multiplos de 100 no son
	// bisiestos, a no ser que que sean multiplos de 400