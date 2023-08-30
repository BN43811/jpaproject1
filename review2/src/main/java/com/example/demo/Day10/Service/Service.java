package com.example.demo.Day10.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.Day10.Model.*;
import com.example.demo.Day10.Repo.*;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	 Repo urepo;
	
	public UserModel saveDetails(UserModel u)
	{
		return urepo.save(u);
	}
	public UserModel updateDetails(UserModel um) {
		return urepo.saveAndFlush(um);
	}
	public boolean deleteGift(int Id) {
		if(urepo.existsById(Id)) {
			urepo.deleteById(Id);
			return true;
		}
		return false;
	}
	public Optional<UserModel> getUserId(int userId)
	   {
		   Optional<UserModel>gift=urepo.findById(userId);
		   if(gift.isPresent())
		   {
			   return gift;
		   }
		   return null;
	   }
	public List<UserModel> sortByDesc(String userFirstName){
		return urepo.findAll(Sort.by(userFirstName).descending());
	}
	public List<UserModel> sortByAesc(String userFirstName){
		return urepo.findAll(Sort.by(userFirstName).ascending());
	}
	public List<UserModel>pagination(int pageNu,int pageSize)
	{
		Page<UserModel>cont=urepo.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	public List<UserModel>paginationAndSorting(int pageNu,int pageSize,String userFirstName)
	{
		Page<UserModel>cont1=urepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(userFirstName).descending()));
		return cont1.getContent();
	}
	
	public List<UserModel> getDetails()
	{
		return urepo.findAll();
	}
}