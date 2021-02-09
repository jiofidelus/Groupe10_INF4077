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
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	
	 @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "personne_id", referencedColumnName = "id")
	private Personne personne;

	public User(Personne personne) {
		super();
		this.personne = personne;
	}
	 
}
