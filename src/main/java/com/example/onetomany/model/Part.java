package com.example.onetomany.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Part {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	private String name;
	
	
	
	@ManyToOne
	@JoinColumn
	private Car car;



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



	public Car getCar() {
		return car;
	}



	public void setCar(Car car) {
		this.car = car;
	}



	public Part(Long id, String name, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.car = car;
	}



	public Part() {
		super();
	}



	@Override
	public String toString() {
		return "Part [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
	
	

}
