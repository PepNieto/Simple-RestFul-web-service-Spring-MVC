package com.example.demo.domain;

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
	private String RebelFullName;
	private String planetName;
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
		return "Rebel [id=" + id + ", firstname=" + RebelFullName + ", lastname=" + planetName + ", dateCreated="
				+ dateCreated + "]";
	}

	public String getRebelFullName() {
		return RebelFullName;
	}
	public void setRebelFullName(String firstname) {
		this.RebelFullName = firstname;
	}
	public String getPlanet() {
		return planetName;
	}
	public void setPlanet(String lastname) {
		this.planetName = lastname;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}

	
}
