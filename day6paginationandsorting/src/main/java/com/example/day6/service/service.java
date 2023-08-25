package com.example.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6.model.model;
import com.example.day6.repo.repo;

@Service

public class service {
	
	@Autowired
	public repo rep;
	
	//post
	public model cricket(model m)
	{
		return rep.save(m); 
	}
	
	//get
	public List<model> getdetails()
	{
		return rep.findAll();
	}
	
	public List<model> sortByAsc(String name)
	{
		return rep.findAll(Sort.by(name).ascending());
	}
	public List<model> sortByDes(String name)
	{
		return rep.findAll(Sort.by(name).descending());

	}
	
	//pagination
	public List<model>pagination(int pagno,int pagesize)
	{
		Page<model> cont=rep.findAll(PageRequest.of(pagno, pagesize));
		return cont.getContent();
	}
	
	//pagination and sorting
	public List<model>paginationandsorting(int pagno,int pagesize,String name)
	{
		Page<model> cont=rep.findAll(PageRequest.of(pagno, pagesize,Sort.by(name).ascending()));
		return cont.getContent();
	}
	
	public List<model>paginationAndsorting(int pagno,int pagesize,String name)
	{
		Page<model> cont=rep.findAll(PageRequest.of(pagno, pagesize,Sort.by(name).descending()));
		return cont.getContent();
	}
}
