package com.examle.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examle.day4.model.PetrolBunk;
import com.examle.day4.repository.fuelRep;


@Service
public class FuelService {
	@Autowired
	fuelRep frepo;
	
	public PetrolBunk saveDetails(PetrolBunk p)
	{
		return frepo.save(p);
	}
	
	public List<PetrolBunk> getDetails()
	{
		return frepo.findAll();
	}
}
