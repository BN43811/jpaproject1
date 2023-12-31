package com.example.demo.Day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Day6.model.GiftModel;

import com.example.demo.Day6.repo.GiftRepo;

@Service
public class GiftService {
	@Autowired
	GiftRepo grepo;
	
	public GiftModel saveDetails(GiftModel gm) {
		return grepo.save(gm);
	}
	public GiftModel updateDetails(GiftModel gm) {
		return grepo.saveAndFlush(gm);
	}
	public void delete(int serialNum) {
		System.out.print("Deleted");
		grepo.deleteById(serialNum);
	}
	public boolean deleteGift(int serialNum) {
		if(grepo.existsById(serialNum)) {
			grepo.deleteById(serialNum);
			return true;
		}
		return false;
	}
	public Optional<GiftModel> getUserId(int userId)
	   {
		   Optional<GiftModel>gift=grepo.findById(userId);
		   if(gift.isPresent())
		   {
			   return gift;
		   }
		   return null;
	   }
	public List<GiftModel> getDetails()
	{
		return grepo.findAll();
	}
	public Optional<GiftModel> getUserId1(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteGift1(int serialNum) {
		// TODO Auto-generated method stub
		return false;
	}
	public void delete1(int serialNum) {
		// TODO Auto-generated method stub
		
	}
	public GiftModel updateDetails1(GiftModel gm) {
		// TODO Auto-generated method stub
		return null;
	}
	public GiftModel saveDetails1(GiftModel gm) {
		// TODO Auto-generated method stub
		return null;
	}
	
}