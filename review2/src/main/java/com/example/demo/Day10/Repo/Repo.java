package com.example.demo.Day10.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Day10.Model.*;


public interface Repo extends JpaRepository<UserModel, Integer>{

	//Page<UserModel> findAll(PageRequest of);

}