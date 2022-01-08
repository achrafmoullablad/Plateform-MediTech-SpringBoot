package com.medi.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicament")
public class Medicament {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String nom;
	private String laboratoire;
	private String maladie;
	public Medicament(int id, String nom, String laboratoire, String maladie) {
		super();
		this.id = id;
		this.nom = nom;
		this.laboratoire = laboratoire;
		this.maladie = maladie;
	}
	public Medicament() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLaboratoire() {
		return laboratoire;
	}
	public void setLaboratoire(String laboratoire) {
		this.laboratoire = laboratoire;
	}
	public String getMaladie() {
		return maladie;
	}
	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}
	
}
