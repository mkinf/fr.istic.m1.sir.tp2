package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;




@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Device {
	
	
	private Long id_device;
	String name;
	private Home home;
	

	public Device() {
		
	}
	
	
//	public Device(String name, Home home) {
//		this.name = name;
//		this.home = home;
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId_device() {
		return id_device;
	}



	public void setId_device(Long id_device) {
		this.id_device = id_device;
	}


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@ManyToOne
	public Home getHome() {
		return home;
	}



	public void setHome(Home home) {
		this.home = home;
	}



	


	
}
