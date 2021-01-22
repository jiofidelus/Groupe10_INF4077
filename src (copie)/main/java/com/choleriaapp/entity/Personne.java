package com.choleriaapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Personne implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String password;
	private String prenom;
	private String role;
	private String numerourgence;
	private String sexe;
	private Long age;
	private Date datenaissance;
	private Long logitude;
	private Long latitude;
	private String email;
	private String ville;
	private String etat;
	private String telephone;
	@OneToMany(mappedBy="personne",fetch=FetchType.LAZY)
	private Collection<Mesure> mesure;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Long getLogitude() {
		return logitude;
	}
	public void setLogitude(Long logitude) {
		this.logitude = logitude;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Collection<Mesure> getMesures() {
		return mesure;
	}
	public void setMesures(Collection<Mesure> mesure) {
		this.mesure = mesure;
	}
	
	public Personne(Long id, String nom, String password, String prenom, String role, String numerourgence, String sexe,
			Long age, Date datenaissance, Long logitude, Long latitude, String email, String ville, String etat,
			String telephone, Collection<Mesure> mesure) {
		super();
		this.id = id;
		this.nom = nom;
		this.password = password;
		this.prenom = prenom;
		this.role = role;
		this.numerourgence = numerourgence;
		this.sexe = sexe;
		this.age = age;
		this.datenaissance = datenaissance;
		this.logitude = logitude;
		this.latitude = latitude;
		this.email = email;
		this.ville = ville;
		this.etat = etat;
		this.telephone = telephone;
		this.mesure = mesure;
	}
	public String getNumerourgence() {
		return numerourgence;
	}
	public void setNumerourgence(String numerourgence) {
		this.numerourgence = numerourgence;
	}
	public Personne() {
		super();
	}
	
		
	
}
