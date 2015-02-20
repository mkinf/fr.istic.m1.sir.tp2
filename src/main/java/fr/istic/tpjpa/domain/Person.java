package fr.istic.tpjpa.domain;



import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CascadeType;

@Entity

public class Person {


	private long id_person;
	private String nom;
	private String prenom;
	private String genre;
	private String mail;
	private Date date_naissance;
	private String profil;
	private List<Person> friends = new ArrayList<Person>();
	private List<Home> home = new ArrayList<Home>();


	
	public Person() {
		 
		//super();
	}


	public Person(String nom, String prenom, String genre, String mail, Date date_naissance) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.mail = mail;
		this.date_naissance = date_naissance;
		
	}


	@Id
	@GeneratedValue
	public long getId_person() {
		return id_person;
	}


	public void setId_person(long id_person) {
		this.id_person = id_person;
	}


	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public Date getDate_naissance() {
		return date_naissance;
	}


	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	@OneToMany(mappedBy ="person")
	public List<Home> getHome() {
		return home;
	}


	public void setHome(List<Home> home) {
		this.home = home;
	}
	
	@ManyToMany
	public List<Person> getFriends() {
		return friends;
	}


	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	
	public String getProfil() {
		return profil;
	}


	public void setProfil(String profil) {
		this.profil = profil;
	}
	

	@Override
	public String toString() {
		return "Person [id=" + id_person + ", nom=" + nom + ", prenom=" + prenom
				+ ", genre=" + genre + ", mail=" + mail + ", naissance="
				+ date_naissance + ", profil=" + "]";
	}


	


 



}
