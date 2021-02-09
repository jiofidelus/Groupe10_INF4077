package com.choleriaapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Mesure {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String soif;
	private String troubedigest;
	private String vomissement;
	private String fatigue;  
	private String diarrhee;
	@ManyToOne
	private Personne personne;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
public void setId2(Long id) {
		this.id = id;
	}
	public String getSoif() {
		return soif;
	}
	public void setSoif(String soif) {
		this.soif = soif;
	}
	public String getTroubedigest() {
		return troubedigest;
	}
	public void setTroubedigest(String troubedigest) {
		this.troubedigest = troubedigest;
	}
	public String getVomissement() {
		return vomissement;
	}
	public void setVomissement(String vomissement) {
		this.vomissement = vomissement;
	}
	public String getFatigue() {
		return fatigue;
	}
	public void setFatigue(String fatigue) {
		this.fatigue = fatigue;
	}
	public String getDiarrhee() {
		return diarrhee;
	}
	public void setDiarrhee(String diarrhee) {
		this.diarrhee = diarrhee;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Mesure(Long id, String soif, String troubedigest, String vomissement, String fatigue, String diarrhee,
			Personne personne) {
		super();
		this.id = id;
		this.soif = soif;
		this.troubedigest = troubedigest;
		this.vomissement = vomissement;
		this.fatigue = fatigue;
		this.diarrhee = diarrhee;
		this.personne = personne;
	}
	public Mesure() {
		super();
	}
	
	
}
