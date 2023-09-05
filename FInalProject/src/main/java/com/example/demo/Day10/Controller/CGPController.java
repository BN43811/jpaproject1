package com.example.demo.Day10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Day10.Model.*;
import com.example.demo.Day10.Service.*;


@RestController
@CrossOrigin
public class CGPController {

	@Autowired
	CGPService pser;
	@PostMapping("/post")
	public CGPModel addinfo(@RequestBody CGPModel st) {
		return pser.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<CGPModel> fetchDetails()
	{
		return pser.getDetails();
	}
	@PutMapping("/updateDetails")
	public CGPModel updateInfo(@RequestBody CGPModel st1)
	{
		return pser.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		pser.deleteDetails(id);
		
		return "Details is Deleted";
		//return stuService.getDetails();
	}
}