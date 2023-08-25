package com.example.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/cricket")
	public model cricket(@RequestBody model m)
	{
		return ser.cricket(m);
	}
	
	@GetMapping
	
	public List<model> cricket()
	{
		return ser.getdetails();
	}
	
	@GetMapping("/sortAsc/{name}")
	public List<model>sortAsc(@PathVariable("name") String name)
	{
		return ser.sortByAsc(name);
	}
	@GetMapping("/sortdes/{name}")
	public List<model>sortDsc(@PathVariable("name") String name)
	{
		return ser.sortByDes(name);
	}
	@GetMapping("/pagination/{num}/{size}")
	public List<model>pagination(@PathVariable("num")int num,@PathVariable("size")int size)
	{
		return ser.pagination(num, size);
	}
	@GetMapping("/paginations/{num}/{size}/{name}")
	public List<model>paginationAndsortingS(@PathVariable("num")int num,@PathVariable("size")int size,@PathVariable("name")String name)
	{
		return ser.paginationAndsorting(num, size,name);
	}	
}
