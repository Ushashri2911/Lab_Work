package com.example.PersonOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int pid;
	private String pname;
	private String email;
	private int contact;
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private PassportDetails passport;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname, String email, int contact, PassportDetails passport) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		this.contact = contact;
		this.passport = passport;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public PassportDetails getPassport() {
		return passport;
	}
	public void setPassport(PassportDetails passport) {
		this.passport = passport;
	}

	

}
