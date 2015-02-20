package fr.istic.tpjpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("C")
public class Heater extends Device{
	private double conso_heater;

	public double getConso_heater() {
		return conso_heater;
	}

	public void setConso_heater(double conso_heater) {
		this.conso_heater = conso_heater;
	}
	
	

}
