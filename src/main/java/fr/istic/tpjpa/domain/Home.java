package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import  javax.persistence.CascadeType;

@Entity
public class Home {

	private long id;
	private String adresse;
	private int superficie;
	private int adresseIp;
	private Person person;
	private List<Device> devices = new ArrayList<Device>();
	
	public Home() {
		 
	}
	
	public Home(String adresse, int superficie, int adresseIp, Person person) {
		super();
		this.adresse = adresse;
		this.superficie = superficie;
		this.adresseIp = adresseIp;
		this.person = person;
	}
	
	
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	@Id
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getAdresseIp() {
		return adresseIp;
	}

	public void setAdresseIp(int adresseIp) {
		this.adresseIp = adresseIp;
	}
	 
	
	@Override
	public String toString() {
		return "Home [adresse=" + adresse + ", superficie=" + superficie
				+ ", adresseIp=" + adresseIp + "]";
	}
	
	@OneToMany(mappedBy="home")
	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	

	
	

}
