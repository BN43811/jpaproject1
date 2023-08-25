package com.example.day6.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.day6.model.model;
import com.example.day6.repo.repo;

@Service
public class service {

	@Autowired
	public repo rep;
	
	//post
	public model hospital(model m)
	{
		return rep.save(m); 
	}
	
	//get
	public List<model> getdetails()
	{
		return rep.findAll();
	}
	
	public void delete(int id)
	{
		System.out.println("Deleted");
		rep.deleteById(id);
	}
	
}
