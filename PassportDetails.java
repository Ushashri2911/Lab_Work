package com.example.PersonOneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PassportDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pn;
	private String name;
	private String nationality;
	private String place;
	@OneToOne
	@JoinColumn(name="pid")
	private Person person;
	public PassportDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassportDetails(int pn, String name, String nationality, String place, Person person) {
		super();
		this.pn = pn;
		this.name = name;
		this.nationality = nationality;
		this.place = place;
		this.person = person;
	}
	public int getPn() {
		return pn;
	}
	public void setPn(int pn) {
		this.pn = pn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
