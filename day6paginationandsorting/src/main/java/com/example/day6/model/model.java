package com.example.day6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cricket")

public class model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="name")
	public String name;
	public String role;
	public String runs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}

}
