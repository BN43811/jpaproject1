package com.example.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6.model.model;
import com.example.day6.service.service;

@RestController

public class controller {

	@Autowired
	public service ser;
	
	
	@PostMapping("/hospital")
	public model hospital(@RequestBody model m)
	{
		return ser.hospital(m);
	}
	
	@GetMapping
	
	public List<model> hospital()
	{
		return ser.getdetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletestud(@PathVariable("id")int id)
	{
		ser.delete(id);
		return "Customer with ID "+id+" is deleted";
	}
}
