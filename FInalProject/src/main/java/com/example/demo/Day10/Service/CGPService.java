package com.example.demo.Day10.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.example.demo.Day10.Model.*;
import com.example.demo.Day10.Repo.*;



@Service
public class CGPService {
	@Autowired
	CGPRepo prepo;
	
	public CGPModel saveDetails(CGPModel e)
	{
		return prepo.save(e);
	}
	public List<CGPModel> getDetails()
	{ 
		return prepo.findAll();
	}
	public  CGPModel updateDetails(CGPModel e1)
	{
		return prepo.saveAndFlush(e1);
	}
	public void deleteDetails(int Id)
	{
		prepo.deleteById(Id);
	}
	

}