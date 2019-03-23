package com.example.onetomany.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private Set<Part> parts;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Part> getParts() {
		return parts;
	}


	
	public void setParts(Set<Part> parts) {
		this.parts = parts;
	}


	public Car(Long id, String name, Set<Part> parts) {
		super();
		this.id = id;
		this.name = name;
		this.parts = parts;
	}


	public Car() {
		
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
