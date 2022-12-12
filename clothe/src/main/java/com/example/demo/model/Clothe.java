package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clothe {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String color;
    private Double size;
    
	public Clothe() {
		
	}

	

	public Clothe(Long id, String name, String color, Double size) {
		
		this.id = id;
		this.name = name;
		this.color = color;
		this.size = size;
	}



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



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Double getSize() {
		return size;
	}



	public void setSize(Double size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "clothe [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	
	

}
