package com.example.demo.domain;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Rebel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private Date dateCreated = new Date();
	
	public Rebel() {
		super();
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Rebel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateCreated="
				+ dateCreated + "]";
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}

	
}
