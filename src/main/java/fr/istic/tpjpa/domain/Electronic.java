package fr.istic.tpjpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("E")
public class Electronic extends Device {
	private double conso_electro;

	public double getConso_electro() {
		return conso_electro;
	}

	public void setConso_electro(double conso_electro) {
		this.conso_electro = conso_electro;
	}

}
