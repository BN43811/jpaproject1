package com.example.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6.model.model;

@Repository
public interface repo extends JpaRepository<model, Integer>{

}
