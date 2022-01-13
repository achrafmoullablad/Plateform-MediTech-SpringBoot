package com.medi.app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="consultation")
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idMedcin")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Medecin medecin;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idPatient")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Patient patient;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idMedicament")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Medicament medicament;
	private Date date;
	public Consultation(int id, Medecin medecin, Patient patient, Medicament medicament, Date date) {
		super();
		this.id = id;
		this.medecin = medecin;
		this.patient = patient;
		this.medicament = medicament;
		this.date = date;
	}
	public Consultation() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
